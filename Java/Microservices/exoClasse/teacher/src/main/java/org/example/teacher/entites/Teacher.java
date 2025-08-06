package org.example.teacher.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.example.teacher.dto.TeacherDTO;

import java.sql.Date;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;


    public Teacher(String nom, String prenom, Date dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public Teacher() {
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

    private Teacher(TeacherBuilder builder) {
        this.nom = builder.nom;
        this.prenom = builder.prenom;
        this.dateNaissance = builder.dateNaissance;
    }

    public TeacherDTO toDTO() {
        return new TeacherDTO(this.prenom, this.nom, this.dateNaissance);
    }

    // Création d'un objet Person à partir d'un PersonDTO
    public static Teacher fromDTO(TeacherDTO dto) {
        return new TeacherBuilder()
                .prenom(dto.getPrenom())
                .nom(dto.getNom())
                .dateNaissance(dto.getDateNaissance())
                .build();
    }

    public static class TeacherBuilder {
        private String nom;
        private String prenom;
        private Date dateNaissance;

        public TeacherBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public TeacherBuilder prenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public TeacherBuilder dateNaissance(Date dateNaissance) {
            this.dateNaissance = dateNaissance;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }

    public String toString() {
        return "Etudiant " + nom + prenom + ", né le : " + dateNaissance;
    }
}

