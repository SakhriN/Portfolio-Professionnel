package org.example.dao;

import org.example.models.CompteBancaire;
import org.example.models.Operation;

import java.util.List;

public class CompteBancaireDAO implements BaseDAO<CompteBancaire> {
    String sql;
    public CompteBancaire get(int id) {

        sql = "SELECT * FROM compte_bancaire WHERE id_compte = ? ";

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