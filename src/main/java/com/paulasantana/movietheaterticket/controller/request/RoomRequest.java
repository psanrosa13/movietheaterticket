package com.paulasantana.movietheaterticket.controller.request;

import com.paulasantana.movietheaterticket.entity.Room;

public class RoomRequest {
    private Room.Type type;
    private int seats;

    public void setType(Room.Type type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }


}
