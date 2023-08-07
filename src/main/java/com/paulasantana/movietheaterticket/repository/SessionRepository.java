package com.paulasantana.movietheaterticket.repository;

import com.paulasantana.movietheaterticket.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface SessionRepository extends JpaRepository<UUID, Session> {
}
