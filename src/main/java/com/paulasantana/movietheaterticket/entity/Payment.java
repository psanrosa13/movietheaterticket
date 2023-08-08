package com.paulasantana.movietheaterticket.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Type type;

    @Enumerated(EnumType.STRING)
    private Status status;

    private LocalDateTime dateTime;

    private enum Status{
        AGUARDANDO_CONFIRMACAO, CONFIRMADO, RECUSADO, CANCELADO
    }

    private enum Type{
        CARTAO_CREDITO, CARTAO_DEBITO, MB_WAY, DINHEIRO
    }
}
