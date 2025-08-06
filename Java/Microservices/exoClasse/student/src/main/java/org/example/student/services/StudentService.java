package org.example.student.services;

import org.example.student.dto.StudentDTO;
import org.example.student.entites.Student;
import org.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDTO getStudent(int id) {
        Student student = studentRepository.getReferenceById(id);
        return student.toDTO();
    }

    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDTOs = new ArrayList<>();
        for (Student student : students) {
            studentDTOs.add(student.toDTO());
        }
        return studentDTOs;
    }

    public StudentDTO addStudent(StudentDTO studentDTO) {
        Student student = Student.fromDTO(studentDTO);
        return studentRepository.save(student).toDTO();
    }

    public StudentDTO updateStudent(int id, StudentDTO studentDTO) {
        Student etudiant = studentRepository.getReferenceById(id);
        if(etudiant != null) {
        etudiant.setPrenom(studentDTO.getPrenom());
        etudiant.setNom(studentDTO.getNom());
        etudiant.setDateNaissance(studentDTO.getDateNaissance());
        return studentRepository.save(etudiant).toDTO();
        }
        return null;
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
