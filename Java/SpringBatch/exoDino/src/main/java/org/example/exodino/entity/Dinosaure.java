package org.example.exodino.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Dinosaure {
    @Id
    private int id;
    private String name;
    private String species;
    private double ageMillionYears;

}
