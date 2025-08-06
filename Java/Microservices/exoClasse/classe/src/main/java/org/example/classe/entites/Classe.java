package org.example.classe.entites;

import jakarta.persistence.*;
import org.example.classe.dto.ClasseDTO;
import org.example.classe.dto.StudentDTO;
import org.example.classe.dto.TeacherDTO;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @OneToMany
    private List<StudentDTO> students;

    @ManyToMany
    private TeacherDTO teacher;


    public Classe(String nom) {
        this.nom = nom;
        this.students = new ArrayList<>();
        this.teacher = null;
    }

    public Classe() {
        this.students = new ArrayList<>();
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

    public List<StudentDTO> getStudents() {
        return students;
    }


    public void setStudents(List<StudentDTO> students) {
        this.students = students;
    }

    public void addStudents(StudentDTO studentDTO) {
        this.students.add(studentDTO);
    }

    public void removeStudents(String prenom, String nom) {
        for (StudentDTO studentDTO : this.students) {
            if (studentDTO.getPrenom().equals(prenom) && studentDTO.getNom().equals(nom)) {
                this.students.remove(studentDTO);
            }
        }
    }

    public TeacherDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDTO teacherDTO) {
        this.teacher = teacherDTO;
    }

    private Classe(ClasseBuilder builder) {
        this.nom = builder.nom;
        this.students = builder.students;
        this.teacher = builder.teacher;
    }

    public ClasseDTO toDTO() {
        return new ClasseDTO(this.nom, this.students, this.teacher);
    }

    // Création d'un objet Person à partir d'un PersonDTO
    public static Classe fromDTO(ClasseDTO dto) {
        return new ClasseBuilder()
                .nom(dto.getNom())
                .students(dto.getStudents())
                .teacher(dto.getTeacher())
                .build();
    }

    public static class ClasseBuilder {
        private String nom;
        private List<StudentDTO> students;
        private TeacherDTO teacher;

        public ClasseBuilder nom(String nom) {
            this.nom = nom;
            return this;
        }

        public ClasseBuilder students(List<StudentDTO> students) {
            this.students = students;
            return this;
        }

        public ClasseBuilder teacher(TeacherDTO teacher) {
            this.teacher = teacher;
            return this;
        }

        public Classe build() {
            return new Classe(this);
        }
    }


    public String toString() {
        return "Etudiant " + nom + prenom + ", né le : " + dateNaissance;
    }
}

