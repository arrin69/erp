package com.first.erp.erp.repository;

import com.first.erp.erp.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Long> {
    List<Actor> findAllByFirstName(String firstName);
}
