package org.example.dao;

import org.example.models.Client;
import org.example.models.CompteBancaire;

import java.util.List;

public class ClientDAO implements BaseDAO<Client> {
    String sql;
    public Client get(int id) {

        sql = "SELECT * FROM client WHERE id_client = ? ";

    }

    public List<Client> getAll() {

        sql = "SELECT * FROM client";
    }


    public List<CompteBancaire> getAll() {
        sql = "SELECT * FROM compte_bancaire";
    }


    public save(CompteBancaire compteBancaire) {
        sql = "INSERT INTO compte_bancaire (solde, client_id) VALUES (?, ?)";
    }

    public update(CompteBancaire compteBancaire) {
        sql = "UPDATE compte_bancaire SET solde = ?, client_id = ? WHERE id_compte = ?";
    }
}