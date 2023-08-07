package com.paulasantana.movietheaterticket.repository;

import com.paulasantana.movietheaterticket.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClientRepository extends JpaRepository<UUID, Client> {
}
