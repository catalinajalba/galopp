/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.util;

import com.atg.galopp.domain.Game;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static com.atg.galopp.domain.GameType.*;

/**
 * Placeholder class for dummy test data
 */
public final class TestData {

    public static LocalDateTime testReferenceLocalDateTime = LocalDateTime.of(2021, Month.OCTOBER, 20, 16, 30, 0);
    public static LocalDateTime testReferenceLocalDateTimeATGTest = LocalDateTime.of(2021, Month.OCTOBER, 21, 16, 30, 0);

    public static List<Game> unsortedList1 = List.of(
            new Game("Week 2: Saturday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-30T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Sunday: GS75",
                    GS75,
                    LocalDateTime.parse("2021-10-24T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Wednesday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-20T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Wednesday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-27T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Monday: V64",
                    V64,
                    LocalDateTime.parse("2021-10-25T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Thursday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-21T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME))
    );


    public static List<Game> expectedList1 = List.of(
            new Game("Week 1: Wednesday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-20T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Sunday: GS75",
                    GS75,
                    LocalDateTime.parse("2021-10-24T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Thursday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-21T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Wednesday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-27T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Saturday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-30T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Monday: V64",
                    V64,
                    LocalDateTime.parse("2021-10-25T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME))
    );


    public static List<Game> unexpectedList1 = List.of(
            new Game("Week 1: Wednesday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-20T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Sunday: GS75",
                    GS75,
                    LocalDateTime.parse("2021-10-24T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Thursday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-21T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Wednesday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-27T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Monday: V64",
                    V64,
                    LocalDateTime.parse("2021-10-25T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Saturday: V75",
                    V75,
                    LocalDateTime.parse("2021-10-30T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME))
    );


    public static List<Game> unsortedListATG = List.of(
            new Game("Week 1: Monday: V64",
                    V64,
                    LocalDateTime.parse("2021-10-25T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Tuesday:V64",
                    V64,
                    LocalDateTime.parse("2021-10-26T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Wednesday: V86",
                    V86,
                    LocalDateTime.parse("2021-10-27T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Thursday: V64",
                    V64,
                    LocalDateTime.parse("2021-10-28T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Friday: V86",
                    V86 ,
                    LocalDateTime.parse("2021-10-29T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Saturday: V75",
                    V75 ,
                    LocalDateTime.parse("2021-10-30T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Sunday: GS75",
                    GS75 ,
                    LocalDateTime.parse("2021-10-31T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Monday: V64",
                    V64 ,
                    LocalDateTime.parse("2021-11-01T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Tuesday:V64",
                    V64 ,
                    LocalDateTime.parse("2021-11-02T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Wednesday: V86",
                    V86 ,
                    LocalDateTime.parse("2021-11-03T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Thursday: V64",
                    V64 ,
                    LocalDateTime.parse("2021-11-04T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Friday: GS75",
                    GS75 ,
                    LocalDateTime.parse("2021-11-05T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Saturday: V75",
                    V75 ,
                    LocalDateTime.parse("2021-11-06T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Sunday: GS75",
                    GS75 ,
                    LocalDateTime.parse("2021-11-07T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME))
        );


    public static List<Game> expectedListATG = List.of(
            new Game("Week 1: Thursday: V64",
                    V64,
                    LocalDateTime.parse("2021-10-28T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Wednesday: V86",
                    V86,
                    LocalDateTime.parse("2021-10-27T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Saturday: V75",
                    V75 ,
                    LocalDateTime.parse("2021-10-30T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Sunday: GS75",
                    GS75 ,
                    LocalDateTime.parse("2021-10-31T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Monday: V64",
                    V64,
                    LocalDateTime.parse("2021-10-25T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Tuesday:V64",
                    V64,
                    LocalDateTime.parse("2021-10-26T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 1: Friday: V86",
                    V86 ,
                    LocalDateTime.parse("2021-10-29T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Thursday: V64",
                    V64 ,
                    LocalDateTime.parse("2021-11-04T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Wednesday: V86",
                    V86 ,
                    LocalDateTime.parse("2021-11-03T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Saturday: V75",
                    V75 ,
                    LocalDateTime.parse("2021-11-06T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Sunday: GS75",
                    GS75 ,
                    LocalDateTime.parse("2021-11-07T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Monday: V64",
                    V64 ,
                    LocalDateTime.parse("2021-11-01T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Tuesday:V64",
                    V64 ,
                    LocalDateTime.parse("2021-11-02T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME)),

            new Game("Week 2: Friday: GS75",
                    GS75 ,
                    LocalDateTime.parse("2021-11-05T16:30:00", DateTimeFormatter.ISO_LOCAL_DATE_TIME))
    );

}
