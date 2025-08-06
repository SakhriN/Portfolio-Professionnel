package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_et;
    String nom_et, prenom_et, email_et;
    @OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
    private List<EDT> edtList;

    @ManyToOne
    @JoinColumn(name = "id_cl")
    Classe classe;

    @OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Note> noteList;
    public Etudiant() {
    }

    public int getId_et() {
        return id_et;
    }

    public void setId_et(int id_et) {
        this.id_et = id_et;
    }

    public String getNom_et() {
        return nom_et;
    }

    public void setNom_et(String nom_et) {
        this.nom_et = nom_et;
    }

    public String getPrenom_et() {
        return prenom_et;
    }

    public void setPrenom_et(String prenom_et) {
        this.prenom_et = prenom_et;
    }

    public String getEmail_et() {
        return email_et;
    }

    public void setEmail_et(String email_et) {
        this.email_et = email_et;
    }

    public Etudiant(String nom_et, String prenom_et, String email_et) {
        this.nom_et = nom_et;
        this.prenom_et = prenom_et;
        this.email_et = email_et;
    }

    @Override
    public String toString() {
        return "Etudiant : " +
                "id_et=" + id_et +
                ", nom_et='" + nom_et +
                ", prenom_et='" + prenom_et +
                ", email_et='" + email_et +
                ". ";
    }
}
