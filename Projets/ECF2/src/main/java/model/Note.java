package model;

import javax.persistence.*;

@Entity
public class Note {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_no;

    int note;

    @ManyToOne
    @JoinColumn(name = "id_ma")
    Matiere matiere;

    @ManyToOne
    @JoinColumn(name="id_et")
    Etudiant etudiant;

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Note() {
    }

    public Note(int note) {
        this.note = note;
    }

    public Note(int note, Matiere matiere) {
        this.note = note;
        this.matiere = matiere;
    }

    public Note(int note, Matiere matiere, Etudiant etudiant) {
        this.note = note;
        this.matiere = matiere;
        this.etudiant = etudiant;
    }

    @Override
    public String toString() {
        return "Note : " +
                "id_no = " + id_no +
                ", note = " + note +
                ", matiere = " + matiere +
                ", etudiant = " + etudiant +
                ". ";
    }
}
