/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.service;

import com.atg.galopp.util.TimeProvider;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static com.atg.galopp.util.TestData.*;

@SpringBootTest
class SortingServiceTest {

    @Autowired
    private SortingService sortingService;


    /**
     * Mocking static method LocalDateTime.now() in the way below didn't work for the integration test.
     * I was forced to use TimeProvider wrapper class.
     */
//    @BeforeAll
//    public static void forceTestDataClassLoad() {
//        new TestData();
//    }
//
//    @Test
//    @DisplayName("1st POSITIVE scenario for sorting")
//    public void sortPositiveTest1() {
//        try (MockedStatic<LocalDateTime> mockedLocalDateTime = Mockito.mockStatic(LocalDateTime.class)) {
//            mockedLocalDateTime.when(LocalDateTime::now).thenReturn(testReferenceLocalDateTime);
//            Assertions.assertThat(sortingService.sort(unsortedList1)).isEqualTo(expectedList1);
//        }
//    }

    @Test
    @DisplayName("1st POSITIVE scenario for sorting")
    public void sortPositiveTest1() {
        TimeProvider.mock(testReferenceLocalDateTime);
        Assertions.assertThat(sortingService.sort(unsortedList1)).isEqualTo(expectedList1);
    }

    @Test
    @DisplayName("1st NEGATIVE scenario for sorting")
    public void sortNegativeTest1() {
        TimeProvider.mock(testReferenceLocalDateTime);
        Assertions.assertThat(sortingService.sort(unsortedList1)).isNotEqualTo(unexpectedList1);
    }

    @Test
    @DisplayName("2nd POSITIVE scenario for sorting ATG cases")
    public void sortPositiveTestATG() {
        TimeProvider.mock(testReferenceLocalDateTimeATGTest);
        Assertions.assertThat(sortingService.sort(unsortedListATG)).isEqualTo(expectedListATG);
    }

    @AfterAll
    public static void unMockLocalDateTime() {
        TimeProvider.unMock();
    }
}
