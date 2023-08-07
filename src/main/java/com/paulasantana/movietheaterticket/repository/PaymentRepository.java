package com.paulasantana.movietheaterticket.repository;

import com.paulasantana.movietheaterticket.entity.Movie;
import com.paulasantana.movietheaterticket.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<UUID, Payment> {
}
