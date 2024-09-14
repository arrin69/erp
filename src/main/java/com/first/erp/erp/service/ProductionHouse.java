package com.first.erp.erp.service;

import com.first.erp.erp.entity.Actor;
import com.first.erp.erp.entity.Film;

import java.util.List;
import java.util.Optional;

public interface ProductionHouse {

    public Optional<Actor> createActor(Actor actor);
    public Optional<List<Actor>> findPersonWithName(String firstname);
    public Optional<Film> findFilmByFilmId(short titleId);
}
