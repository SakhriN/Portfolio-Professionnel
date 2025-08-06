package org.example.note.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Matiere {
    private long id;
    private String nom;
    private int coefficient;
}
