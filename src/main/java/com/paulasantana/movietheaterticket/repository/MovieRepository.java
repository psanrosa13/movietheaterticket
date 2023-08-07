package com.paulasantana.movietheaterticket.repository;

import com.paulasantana.movietheaterticket.entity.Login;
import com.paulasantana.movietheaterticket.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MovieRepository extends JpaRepository<UUID, Movie> {
}
