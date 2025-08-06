package org.example.classe.controllers;


import org.example.classe.dto.ClasseDTO;
import org.example.classe.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/classe")
public class ClasseRestController {
@Autowired
ClasseService classeService;

@GetMapping()
public List<ClasseDTO> getAllClasses() {
    return classeService.getAllClasses();
}

@GetMapping("{id}")
    public ClasseDTO getClasse(@PathVariable int id) {
        return classeService.getClasse(id);
    }

    @PostMapping()
    public ClasseDTO addClasse(@RequestBody ClasseDTO classeDTO) {
    return classeService.addClasse(classeDTO);
    }

    @PutMapping("{id}")
    public ClasseDTO updateClasse(@PathVariable int id, @RequestBody ClasseDTO classeDTO) {

    return classeService.updateClasse(id, classeDTO);
    }

    @DeleteMapping("{id}")
    public void deleteClasse(@PathVariable int id) {
    classeService.deleteClasse(id);
    }

}
