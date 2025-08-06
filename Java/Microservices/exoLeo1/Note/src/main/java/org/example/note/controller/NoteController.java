package org.example.note.controller;

import org.example.note.dto.NoteDtoReceive;
import org.example.note.dto.NoteDtoResponse;
import org.example.note.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/note")
public class NoteController {

    @Autowired
    NoteService noteService;

    @GetMapping("/{id}")
    public ResponseEntity<NoteDtoResponse> getById (@PathVariable("id") Long id){
        return ResponseEntity.ok(noteService.getById(id));
    }

    @PostMapping
    public ResponseEntity<NoteDtoResponse> getById (@RequestBody NoteDtoReceive classroomDtoReceive){
        return ResponseEntity.ok(noteService.save(classroomDtoReceive));
    }
}
