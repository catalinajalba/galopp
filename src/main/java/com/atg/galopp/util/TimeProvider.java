/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.util;

import java.time.LocalDateTime;

public class TimeProvider {
    private static boolean mocked = false;
    private static LocalDateTime mockedLocalDateTime;

    public static LocalDateTime now() {
        if (mocked) return mockedLocalDateTime;
        return LocalDateTime.now();
    }

    public synchronized static void mock(LocalDateTime mockedLocalDateTime) {
        TimeProvider.mockedLocalDateTime = mockedLocalDateTime;
        TimeProvider.mocked = true;
    }

    public synchronized static void unMock() {
        TimeProvider.mocked = false;
    }
}
