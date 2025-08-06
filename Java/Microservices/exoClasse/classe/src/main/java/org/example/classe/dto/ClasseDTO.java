package org.example.classe.dto;

import java.util.List;

public class ClasseDTO {
    private String nom;
    private List<StudentDTO> students;
    private TeacherDTO teacher;


    public ClasseDTO(String nom, List<StudentDTO> students, TeacherDTO teacher) {
        this.nom = nom;
        this.students = students;
        this.teacher = teacher;
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

}
