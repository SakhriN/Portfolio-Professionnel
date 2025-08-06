package org.example.models;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private Integer identifiant;
    private Integer numeroTelephone;
    private List<CompteBancaire> comptes;

    public Client() {
    }

    public Client(String nom, String prenom, Integer identifiant, Integer numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.identifiant = identifiant;
        this.numeroTelephone = numeroTelephone;
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

    public Integer getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(Integer identifiant) {
        this.identifiant = identifiant;
    }

    public Integer getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(Integer numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public List<CompteBancaire> getComptes() {
        return comptes;
    }

    public void setComptes(List<CompteBancaire> comptes) {
        this.comptes = comptes;
    }


    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", identifiant=" + identifiant +
                ", numeroTelephone=" + numeroTelephone +
                ", comptes=" + comptes +
                '}';
    }
}
