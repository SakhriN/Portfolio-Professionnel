package org.example.note.entity;

import org.springframework.data.annotation.Id;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Note {
    @Id
    private long idNote;
    private double note;
    private long idStudent;
    private long idMatiere;

    public Note(double note,long idStudent, Long idMatiere) {
        this.note = note;
        this.idStudent = idStudent;
        this.idMatiere = idMatiere;
    }



}
