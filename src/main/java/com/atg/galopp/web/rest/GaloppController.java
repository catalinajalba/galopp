/*
 * Copyright AB Trav och Galopp (556180-4161)
 */

package com.atg.galopp.web.rest;

import com.atg.galopp.domain.Game;
import com.atg.galopp.service.SortingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GaloppController {

    private final SortingService sortingService;

    public GaloppController(SortingService sortingService) {
        this.sortingService = sortingService;
    }

    @PostMapping("/sort")
    public ResponseEntity<List<Game>> sort(@RequestBody List<Game> games) {
        return ResponseEntity.ok(sortingService.sort(games));
    }

}
