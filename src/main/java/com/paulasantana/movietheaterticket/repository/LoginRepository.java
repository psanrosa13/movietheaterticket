package com.paulasantana.movietheaterticket.repository;

import com.paulasantana.movietheaterticket.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LoginRepository extends JpaRepository<UUID, Login> {
}
