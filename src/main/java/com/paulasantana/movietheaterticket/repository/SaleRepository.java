package com.paulasantana.movietheaterticket.repository;

import com.paulasantana.movietheaterticket.entity.Payment;
import com.paulasantana.movietheaterticket.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SaleRepository extends JpaRepository<UUID, Sale> {
}
