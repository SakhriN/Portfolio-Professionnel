package org.example.matiere.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MatiereDtoReceive {
    private String nom;
    private int coefficient;
}