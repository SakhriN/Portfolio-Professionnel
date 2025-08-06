package org.example.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.example.models.Person;

public class PersonDAO {

    private Connection connection;

    public PersonDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Person> getAllPersonnes() {
        List<Person> personnes = new ArrayList<>();
        try {
            String request = "SELECT * FROM etudiant";
            PreparedStatement statement = connection.prepareStatement(request);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Person personne = new Person();
                personne.setId(resultSet.getInt("id"));
                personne.setFirstName(resultSet.getString("firstName"));
                personne.setLastName(resultSet.getString("lastName"));
                personnes.add(personne);
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return personnes;
    }

    // Ajouter d'autres méthodes pour l'insertion, la mise à jour et la suppression des personnes
}
