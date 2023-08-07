package com.paulasantana.movietheaterticket.entity;

import jakarta.persistence.*;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;
    private int seats;

    public Long getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public enum Type{
        STANDARD, PREMIUM
    }
}
