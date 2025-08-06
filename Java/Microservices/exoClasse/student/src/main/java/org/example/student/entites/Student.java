package org.example.student.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.example.student.dto.StudentDTO;

import java.sql.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;


    public Student(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    private Student(StudentBuilder builder) {
        this.nom = builder.nom;
        this.prenom = builder.prenom;
        this.dateNaissance = builder.dateNaissance;
    }

    public StudentDTO toDTO() {
        return new StudentDTO(this.prenom, this.nom, this.dateNaissance);
    }

    // Création d'un objet Person à partir d'un PersonDTO
    public static Student fromDTO(StudentDTO dto) {
        return new StudentBuilder()
                .prenom(dto.getPrenom())
                .nom(dto.getNom())
                .dateNaissance(dto.getDateNaissance())
                .build();
    }

    public static class StudentBuilder {
        private String nom;
        private String prenom;
        private Date dateNaissance;

        public StudentBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public StudentBuilder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public StudentBuilder dateNaissance(Date dateNaissance) {
            this.dateNaissance = dateNaissance;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public String toString() {
        return "Etudiant " + nom + prenom + ", né le : " + dateNaissance;
    }
}

