/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class GaloppConfiguration {

    @Value("${special.days}")
    private List<String> specialDaysStrings;

    @Getter
    private List<LocalDate> specialDays;

    @PostConstruct
    private void init() {
        specialDays = specialDaysStrings.stream().map(s -> LocalDate.parse(s, DateTimeFormatter.ISO_LOCAL_DATE)).collect(Collectors.toList());
    }

}
