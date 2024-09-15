package com.first.moviestore.api;


import com.first.moviestore.entity.Actor;
import com.first.moviestore.entity.Film;
import com.first.moviestore.service.Hollywood;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path = "/moviehouse")
@Slf4j
public class FamilyController {


    private final Hollywood hollywood;

    public FamilyController(Hollywood hollywood) {
        this.hollywood = hollywood;
    }

    @PutMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE, path = "/person")
    public HttpStatusCode createActor(@RequestBody Actor person) {
        Optional<Actor> personOptional = hollywood.createActor(person);
        if (personOptional.isPresent()) {
            return HttpStatusCode.valueOf(200);
        } else {
            return HttpStatusCode.valueOf(404);
        }
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE, path = "/actor/{firstname}")
    public List<Actor> findActor(@PathVariable String firstname) {
        log.info("Looking for actor with firstName {}", firstname);
        Optional<List<Actor>> personWithName = hollywood.findPersonWithName(firstname);
        return personWithName.orElse(Collections.emptyList());
    }


    @GetMapping(produces = APPLICATION_JSON_VALUE, path = "/film/{filmId}")
    public ResponseEntity<Film> findFilm(@PathVariable Short filmId) {
        log.info("Looking for film with filmId {}", filmId);
        Optional<Film> filmByFilmId = hollywood.findFilmByFilmId(filmId);

        if (filmByFilmId.isPresent()) {
            return ResponseEntity.of(filmByFilmId);
        } else {
            log.info("No record found for filmId {}", filmId);
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE, path = "/actor")
    public ResponseEntity<Actor> addNewActor(@RequestBody Actor actor) {
        log.info("Adding new actor {}", actor);
        Optional<Actor> actor1 = hollywood.createActor(actor);
        return actor1.isPresent() ? ResponseEntity.of(actor1) : ResponseEntity.badRequest().build();
    }

}
