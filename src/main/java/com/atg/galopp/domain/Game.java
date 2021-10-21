/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.domain;

import com.atg.galopp.config.GaloppConfiguration;
import com.atg.galopp.util.ApplicationContextUtils;
import com.atg.galopp.util.TimeProvider;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.Data;
import org.threeten.extra.YearWeek;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static com.atg.galopp.domain.GameType.*;
import static java.time.DayOfWeek.*;

@Data
@JsonIncludeProperties({"name", "type", "start"})
public class Game {

    final private String name;
    final private GameType type;
    final private LocalDateTime start;

    // for filtering inactive bets
    private LocalDateTime end;

    public boolean isBigGame() {
        return ((V86 == type && WEDNESDAY.equals(start.getDayOfWeek())) ||
                (V75 == type && SATURDAY.equals(start.getDayOfWeek())) ||
                (GS75 == type && SUNDAY.equals(start.getDayOfWeek())) ||
                isSpecialDate());
    }

    public boolean isSpecialDate() {
        return  getSpecialDays().stream().anyMatch(x -> x.equals(start.toLocalDate()));
    }

    private List<LocalDate> getSpecialDays() {
        return ApplicationContextUtils.getApplicationContext().getBean(GaloppConfiguration.class).getSpecialDays();
    }

    public boolean isOnReferenceDate() {
        return TimeProvider.now().getDayOfWeek().equals(start.getDayOfWeek());
    }

    public YearWeek getWeek() {
        return YearWeek.from(start);
    }

}
