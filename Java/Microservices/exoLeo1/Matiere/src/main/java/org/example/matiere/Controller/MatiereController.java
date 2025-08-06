package org.example.matiere.Controller;


import org.example.matiere.Service.MatiereService;
import org.example.matiere.dto.MatiereDtoReceive;
import org.example.matiere.dto.MatiereDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("api/matiere")
    public class MatiereController {

        @Autowired
        MatiereService service;

        @GetMapping("/{id}")
        public ResponseEntity<MatiereDtoResponse> getById (@PathVariable("id") long id){
            return ResponseEntity.ok(service.getById(id));
        }

        @PostMapping
        public ResponseEntity<MatiereDtoResponse> addStudent (@RequestBody MatiereDtoReceive matiereDtoReceive){
            return ResponseEntity.ok(service.save(matiereDtoReceive));
        }
    }
