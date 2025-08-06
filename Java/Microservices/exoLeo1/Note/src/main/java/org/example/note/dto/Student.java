package org.example.note.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private long id;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private String subject;
}
