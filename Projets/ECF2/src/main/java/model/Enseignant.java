package model;

import javax.persistence.*;

@Entity
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_en;
    int age_en;

    String nom_en, prenom_en, grade;
    Boolean Est_Principal;
    @ManyToOne
    @JoinColumn(name = "id_de")
    Departement departement;

    public int getId_en() {
        return id_en;
    }

    public void setId_en(int id_en) {
        this.id_en = id_en;
    }

    public int getAge_en() {
        return age_en;
    }

    public void setAge_en(int age_en) {
        this.age_en = age_en;
    }

    public String getNom_en() {
        return nom_en;
    }

    public void setNom_en(String nom_en) {
        this.nom_en = nom_en;
    }

    public String getPrenom_en() {
        return prenom_en;
    }

    public void setPrenom_en(String prenom_en) {
        this.prenom_en = prenom_en;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Boolean getEst_Principal() {
        return Est_Principal;
    }

    public void setEst_Principal(Boolean Est_Principal) {
        this.Est_Principal = Est_Principal;
    }
    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Enseignant() {
    }

    public Enseignant(int age_en, String nom_en, String prenom_en, String grade, Boolean Est_Principal) {
        this.age_en = age_en;
        this.nom_en = nom_en;
        this.prenom_en = prenom_en;
        this.grade = grade;
        this.Est_Principal = Est_Principal;
    }

    public Enseignant(int age_en, String nom_en, String prenom_en, String grade, Boolean Est_Principal, Departement departement) {
        this.age_en = age_en;
        this.nom_en = nom_en;
        this.prenom_en = prenom_en;
        this.grade = grade;
        this.Est_Principal = Est_Principal;
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id_en = " + id_en +
                ", age_en = " + age_en +
                ", nom_en = " + nom_en +
                ", prenom_en = " + prenom_en +
                ", grade = " + grade +
                ", est_Principal = " + Est_Principal +
                ", departement = " + departement +
                ". ";
    }
}
