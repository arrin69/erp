package com.first.erp.erp.repository;

import com.first.erp.erp.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface FilmRepository extends JpaRepository<Film, Short> {
    @Query("SELECT u from film u where u.film_Id=?1")
    Optional<Film> findByFilmId(Short filmId);
//    Film findByFilmId(@Param("filmId") Short filmId);
}
