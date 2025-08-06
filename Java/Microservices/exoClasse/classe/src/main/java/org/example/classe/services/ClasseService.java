package org.example.classe.services;

import org.example.classe.dto.ClasseDTO;
import org.example.classe.entites.Classe;
import org.example.classe.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    public ClasseDTO getClasse(int id) {
        Classe classe = classeRepository.getReferenceById(id);
        return classe.toDTO();
    }

    public List<ClasseDTO> getAllClasses() {
        List<Classe> classes = classeRepository.findAll();
        List<ClasseDTO> classeDTO = new ArrayList<>();
        for (Classe classe : classes) {
            classeDTO.add(classe.toDTO());
        }
        return classeDTO;
    }

    public ClasseDTO addClasse(ClasseDTO classeDTO) {
        Classe classe = Classe.fromDTO(classeDTO);
        return classeRepository.save(classe).toDTO();
    }

    public ClasseDTO updateClasse(int id, ClasseDTO classeDTO) {
        Classe classe = classeRepository.getReferenceById(id);
        if (classe != null) {
            classe.setNom(classeDTO.getNom());
            classe.setStudents(classeDTO.getStudents());
            classe.setTeacher(classeDTO.getTeacher());
            return classeRepository.save(classe).toDTO();
        }
        return null;
    }

    public void deleteClasse(int id) {
        classeRepository.deleteById(id);
    }
}
