package org.example.poo.hotel;

public class Reservation {

    int number;

    public static enum Status {
        VALIDATED,

        CANCELLED,

    }
    public Status status;

    public Status getStatus() {
        return status;
    }

    Client client;

    Chambre chambre;

    public Reservation() {
    }

    public Reservation(int number, Status status, Client client, Chambre chambre) {
        this.number = number;
        this.status = status;
        this.client = client;
        this.chambre = chambre;
    }
}
