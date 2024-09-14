package com.first.erp.erp.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "film")
@Table(name = "film", schema = "sakila")
public class Film {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic
    @Column(name = "film_id")
    private Short film_Id;

    @Basic
    @Column(name = "description")
    private String description;

//    @ManyToMany(cascade = {CascadeType.ALL})
//    @JoinTable(
//            name = "film_actor",
//            joinColumns = {@JoinColumn(name = "film_id")},
//            inverseJoinColumns = {@JoinColumn(name = "actor_id")}
//    )

//    private List<Actor> actors  = new ArrayList<>();

    @Basic
    @Column(name = "language_id")
    private Short language_id;

    @Basic
    @Column(name = "last_update")
    private Timestamp last_update;

    @Basic
    @Column(name = "length")
    private Short length;

    @Basic
    @Column(name = "original_language_id")
    private Short original_language_id;

    @Basic
    @Column(name = "rating", columnDefinition = "enum('G', 'PG', 'PG-13', 'R', 'NC-17')")
    private Object rating;

//    @Basic
//    @Column(name = "release_year")
//    private int release_year;

    //
    //    public int getRelease_year() {
    //        return release_year;
    //    }
    //
    //    public void setRelease_year(int release_year) {
    //        this.release_year = release_year;
    //    }
    //
    @Basic
    @Column(name = "special_features", columnDefinition = "set('Trailer', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')")
    private Object special_features;

    @Basic
    @Column(name = "rental_duration")
    private Short rental_duration;

    @Basic
    @Column(name = "rental_rate", columnDefinition = "decimal(4,2)")
    private Float rental_rate;

    @Basic
    @Column(name = "replacement_cost")
    private BigDecimal replacement_cost;

    @Basic
    @Column(name = "title")
    private String title;

    public Short getFilm_Id() {
        return film_Id;
    }

    public void setFilm_Id(Short film_Id) {
        this.film_Id = film_Id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public List<Actor> getActors() {
//        return actors;
//    }
//
//    public void setActors(List<Actor> actors) {
//        this.actors = actors;
//    }

    public Short getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Short language_id) {
        this.language_id = language_id;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    public Short getLength() {
        return length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    public Short getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(Short original_language_id) {
        this.original_language_id = original_language_id;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Object getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(Object special_features) {
        this.special_features = special_features;
    }

    public Short getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(Short rental_duration) {
        this.rental_duration = rental_duration;
    }

    public Float getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(Float rental_rate) {
        this.rental_rate = rental_rate;
    }

    public BigDecimal getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(BigDecimal replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
