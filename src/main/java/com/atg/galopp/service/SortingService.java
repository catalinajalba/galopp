/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.service;

import com.atg.galopp.domain.Game;
import com.atg.galopp.util.TimeProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
@Slf4j
public class SortingService {

    public List<Game> sort(List<Game> unsortedGames) {

        List<Game> sortedList = unsortedGames.stream()
                .filter(game -> game.getStart().toLocalDate().isAfter(TimeProvider.now().toLocalDate().minus(1, DAYS)))
                .distinct()
                .sorted(
                        Comparator
                                .comparing(Game::getWeek)
                                .reversed()
                                .thenComparing(Game::isOnReferenceDate)
                                .thenComparing(Game::isBigGame)
                                .reversed()
                                .thenComparing(Game::getStart)
                )
                .collect(Collectors.toList());

        log.debug(sortedList.toString());

        return sortedList;
    }

}
