package org.example.poo.hotel;

public class Chambre {

    int number;
    public static enum Status{
        FREE,

        OCCUPIED,
        ;
    }
public Status status;

    public Status getStatus() {
        return status;
    }

    float price;

    int capacity;

    public Chambre() {
    }

    public Chambre(int number, Status status, float price, int capacity) {
        this.number = number;
        this.status = status;
        this.price = price;
        this.capacity = capacity;
    }
}
