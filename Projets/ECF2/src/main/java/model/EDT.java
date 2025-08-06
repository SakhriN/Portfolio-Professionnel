package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="emploi_du_temps")
public class EDT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_em;

    LocalDateTime dateDebut, dateFin;

    @ManyToOne
    @JoinColumn(name = "id_et")
    Etudiant etudiant;

    public int getId_em() {
        return id_em;
    }

    public void setId_em(int id_em) {
        this.id_em = id_em;
    }

    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDateTime dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDateTime getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDateTime dateFin) {
        this.dateFin = dateFin;
    }
    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public EDT() {
    }

    public EDT(LocalDateTime dateDebut, LocalDateTime dateFin) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public EDT(LocalDateTime dateDebut, LocalDateTime dateFin, Etudiant etudiant) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "EDT : " +
                "id_em = " + id_em +
                ", dateDebut = " + dateDebut +
                ", dateFin = " + dateFin +
                ". ";
    }
}
