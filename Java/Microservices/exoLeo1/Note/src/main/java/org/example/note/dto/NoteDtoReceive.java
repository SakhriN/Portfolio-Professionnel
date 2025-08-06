package org.example.note.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDtoReceive {
    private double note;
    private long idStudent;
    private long idMatiere;
}
