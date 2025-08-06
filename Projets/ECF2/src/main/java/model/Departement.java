package model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_de;

    String nom_de;

    @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Classe> classeList;

    @OneToMany(mappedBy = "departement", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Enseignant> enseignantList;



    public int getId_de() {
        return id_de;
    }

    public void setId_de(int id_de) {
        this.id_de = id_de;
    }

    public String getNom_de() {
        return nom_de;
    }

    public void setNom_de(String nom_de) {
        this.nom_de = nom_de;
    }

    public List<Classe> getClasseList() {
        return classeList;
    }

    public void setClasseList(List<Classe> classeList) {
        this.classeList = classeList;
    }

    public List<Enseignant> getEnseignantList() {
        return enseignantList;
    }

    public void setEnseignantList(List<Enseignant> enseignantList) {
        this.enseignantList = enseignantList;
    }

    public Departement() {
    }

    public Departement(String nom_de) {
        this.nom_de = nom_de;
    }

    public Departement(String nom_de, List<Classe> classeList) {
        this.nom_de = nom_de;
        this.classeList = classeList;
    }

    @Override
    public String toString() {
        return "Departement : " +
                "id_de = " + id_de +
                ", nom_de = " + nom_de +
                ". ";
    }
}
