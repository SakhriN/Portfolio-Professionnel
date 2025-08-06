package org.example.dao;

import org.example.models.Operation;

import java.util.List;

public class OperationDAO implements BaseDAO<Operation> {

    String sql;

    public Operation get(int id) {
        sql = "SELECT * FROM operation WHERE id_operation = ? ";
    }

    public List<Operation> getAll() {
        sql = "SELECT * FROM operation";
    }


    public save(Operation operation) {
        sql = "INSERT INTO operation (montant, type, compte_id) VALUES (?, ?, ?)";
    }

    public update(Operation operation) {
        sql = "UPDATE operation SET montant = ?, type = ?, compte_id = ? WHERE id_operation = ?";
    }

}
