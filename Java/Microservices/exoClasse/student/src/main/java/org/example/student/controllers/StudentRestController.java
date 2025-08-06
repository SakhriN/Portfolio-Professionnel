package org.example.student.controllers;


import org.example.student.dto.StudentDTO;
import org.example.student.repository.StudentRepository;
import org.example.student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {
@Autowired
StudentService studentService;

@GetMapping()
public List<StudentDTO> getAllStudents() {
    return studentService.getAllStudents();
}

@GetMapping("{id}")
    public StudentDTO getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @PostMapping()
    public StudentDTO addStudent(@RequestBody StudentDTO studentDTO) {
    return studentService.addStudent(studentDTO);
    }

    @PutMapping("{id}")
    public StudentDTO updateStudent(@PathVariable int id, @RequestBody StudentDTO studentDTO) {

    return studentService.updateStudent(id, studentDTO);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable int id) {
    studentService.deleteStudent(id);
    }

}
