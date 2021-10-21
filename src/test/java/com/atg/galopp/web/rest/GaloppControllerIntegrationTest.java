/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.web.rest;

import com.atg.galopp.domain.Game;
import com.atg.galopp.util.TimeProvider;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static com.atg.galopp.util.TestData.*;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GaloppControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeAll
    public static void mockLocalDateTime() {
        TimeProvider.mock(testReferenceLocalDateTime);
    }

    @AfterAll
    public static void unMockLocalDateTime() {
        TimeProvider.unMock();
    }

    @Test
    public void sortGames() {
            ResponseEntity<List<Game>> response =
                    restTemplate.exchange(
                            "/api/sort",
                            HttpMethod.POST,
                            new HttpEntity<>(unsortedList1),
                            new ParameterizedTypeReference<>() {
                            }
                    );

            assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(response.getBody()).isEqualTo(expectedList1);
    }

}
