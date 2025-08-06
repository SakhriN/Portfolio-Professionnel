package org.example.note.service;

import org.example.note.dto.Matiere;
import org.example.note.dto.NoteDtoReceive;
import org.example.note.dto.NoteDtoResponse;
import org.example.note.dto.Student;
import org.example.note.entity.Note;
import org.example.note.repository.NoteRepository;
import org.example.note.tools.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    public NoteDtoResponse save (NoteDtoReceive noteDtoReceive){
        Note note = dtoToNote(noteDtoReceive);
        noteRepository.save(note);
        return noteToDto(note);
    }

    public NoteDtoResponse getById (Long id){
        return noteToDto(noteRepository.findById(id).orElse(null));
    }

    public Note dtoToNote (NoteDtoReceive noteDtoReceive){
        return new Note(noteDtoReceive.getNote(),noteDtoReceive.getIdStudent(),noteDtoReceive.getIdMatiere());
    }

    public NoteDtoResponse noteToDto (Note note){
        if(note == null){
            return null;
        }
        Student student = null;
        Matiere matiere = null;

        RestClient<Student> studentRestClient = new RestClient<>("http://localhost:8081/api/student/");
        student = studentRestClient.getRequest(Student.class, String.valueOf(note.getIdStudent()));

        RestClient<Matiere> matiereRestClient = new RestClient<>("http://localhost:8085/api/matiere/");
        matiere = matiereRestClient.getRequest(Matiere.class, String.valueOf(note.getIdMatiere()));

        return new NoteDtoResponse(note.getIdNote(),note.getIdNote(),student,matiere);
    }
}
