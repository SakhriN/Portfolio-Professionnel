package org.example.poo.hotel;

import java.util.List;

public class Hotel {
    String name;
    List<Chambre> Chambres;
    List<Reservation> Reservations;
    List<Client> Clients;

    public Hotel() {
    }

    public Hotel(String name, List<Chambre> chambres, List<Reservation> reservations, List<Client> clients) {
        this.name = name;
        Chambres = chambres;
        Reservations = reservations;
        Clients = clients;
    }
}
