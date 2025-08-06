package org.example.teacher.services;

import org.example.teacher.dto.TeacherDTO;
import org.example.teacher.entites.Teacher;
import org.example.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public TeacherDTO getTeacher(int id) {
        Teacher teacher = teacherRepository.getReferenceById(id);
        return teacher.toDTO();
    }

    public List<TeacherDTO> getAllTeachers() {
        List<Teacher> teachers = teacherRepository.findAll();
        List<TeacherDTO> teacherDTO = new ArrayList<>();
        for (Teacher teacher : teachers) {
            teacherDTO.add(teacher.toDTO());
        }
        return teacherDTO;
    }

    public TeacherDTO addTeacher(TeacherDTO teacherDTO) {
        Teacher teacher = Teacher.fromDTO(teacherDTO);
        return teacherRepository.save(teacher).toDTO();
    }

    public TeacherDTO updateTeacher(int id, TeacherDTO teacherDTO) {
        Teacher enseignant = teacherRepository.getReferenceById(id);
        if (enseignant != null) {
            enseignant.setPrenom(teacherDTO.getPrenom());
            enseignant.setNom(teacherDTO.getNom());
            enseignant.setDateNaissance(teacherDTO.getDateNaissance());
            return teacherRepository.save(enseignant).toDTO();
        }
        return null;
    }

    public void deleteTeacher(int id) {
        teacherRepository.deleteById(id);
    }
}
