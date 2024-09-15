package com.first.moviestore.service;

import com.first.moviestore.entity.Actor;
import com.first.moviestore.entity.Film;

import java.util.List;
import java.util.Optional;

public interface ProductionHouse {

    public Optional<Actor> createActor(Actor actor);
    public Optional<List<Actor>> findPersonWithName(String firstname);
    public Optional<Film> findFilmByFilmId(short titleId);
}
