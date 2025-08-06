package org.example.matiere.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MatiereDtoResponse {
    private long id;
    private String nom;
    private int coefficient;
}
