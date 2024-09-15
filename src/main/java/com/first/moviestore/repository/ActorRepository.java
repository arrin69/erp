package com.first.moviestore.repository;

import com.first.moviestore.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    List<Actor> findAllByFirstName(String firstName);
}
