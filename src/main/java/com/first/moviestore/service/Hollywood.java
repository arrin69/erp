package com.first.moviestore.service;

import com.first.moviestore.entity.Actor;
import com.first.moviestore.entity.Film;
import com.first.moviestore.repository.ActorRepository;
import com.first.moviestore.repository.FilmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class Hollywood implements ProductionHouse {

    private final ActorRepository actorRepository;
    private final FilmRepository filmRepository;

    public Hollywood(ActorRepository actorRepository, FilmRepository filmRepository) {
        this.actorRepository = actorRepository;
        this.filmRepository = filmRepository;
    }

    @Override
    public Optional<Actor> createActor(Actor actor) {
        return Optional.of(actorRepository.save(actor));
    }

    @Override
    public Optional<List<Actor>> findPersonWithName(String firstname) {
        return Optional.of(actorRepository.findAllByFirstName(firstname));
    }

    @Override
    public Optional<Film> findFilmByFilmId(short titleId) {
        try {
            return filmRepository.findByFilmId(titleId);
        } catch (MethodArgumentTypeMismatchException methodArgumentTypeMismatchException) {
            log.error("title id is not correct ", methodArgumentTypeMismatchException);
            return Optional.empty();
        }
    }
}
