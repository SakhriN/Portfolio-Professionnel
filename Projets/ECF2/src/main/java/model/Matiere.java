package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_ma;
    int duree_ma, coef_ma;
    String nom_ma, desc_ma;

    @OneToMany(mappedBy = "etudiant", fetch = FetchType.LAZY)
    private List<Note> noteList;

    public int getId_ma() {
        return id_ma;
    }

    public void setId_ma(int id_ma) {
        this.id_ma = id_ma;
    }

    public int getDuree_ma() {
        return duree_ma;
    }

    public void setDuree_ma(int duree_ma) {
        this.duree_ma = duree_ma;
    }

    public int getCoef_ma() {
        return coef_ma;
    }

    public void setCoef_ma(int coef_ma) {
        this.coef_ma = coef_ma;
    }

    public String getNom_ma() {
        return nom_ma;
    }

    public void setNom_ma(String nom_ma) {
        this.nom_ma = nom_ma;
    }

    public String getDesc_ma() {
        return desc_ma;
    }

    public void setDesc_ma(String desc_ma) {
        this.desc_ma = desc_ma;
    }

    public Matiere() {
    }

    public Matiere(int duree_ma, int coef_ma, String nom_ma, String desc_ma) {
        this.duree_ma = duree_ma;
        this.coef_ma = coef_ma;
        this.nom_ma = nom_ma;
        this.desc_ma = desc_ma;
    }

    @Override
    public String toString() {
        return "Matiere : " +
                "id_ma = " + id_ma +
                ", duree_ma = " + duree_ma +
                ", coef_ma = " + coef_ma +
                ", nom_ma = " + nom_ma +
                ", desc_ma = " + desc_ma +
                ". ";
    }
}


