package com.amit.springaop.example4;

public class Passenger {
    private int id;

    public Passenger(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Passenger : "+ id;
    }
}
