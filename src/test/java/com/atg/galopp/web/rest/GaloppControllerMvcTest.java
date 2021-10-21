/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.web.rest;

import com.atg.galopp.domain.Game;
import com.atg.galopp.service.SortingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static com.atg.galopp.util.TestData.expectedList1;
import static com.atg.galopp.util.TestData.unsortedList1;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GaloppController.class)
@AutoConfigureJsonTesters
class GaloppControllerMvcTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private SortingService sortingService;

    // This object will be initialized thanks to @AutoConfigureJsonTesters
    // Because of a bug Intellij IDEA shows autowiring errors: https://youtrack.jetbrains.com/issue/IDEA-168250
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private JacksonTester<List<Game>> jsonGames;

    @Test
    public void sortGames() throws Exception {
        // given
        given(sortingService.sort(unsortedList1))
                .willReturn(expectedList1);
        // when
        mvc.perform(post("/api/sort")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .content(jsonGames.write(unsortedList1).getJson()))
                .andExpectAll(
                        // then
                        status().is2xxSuccessful(),
                        content().json(jsonGames.write(expectedList1).getJson())
                );
    }

}
