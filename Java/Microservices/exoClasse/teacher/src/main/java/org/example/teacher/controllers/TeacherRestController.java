package org.example.teacher.controllers;


import org.example.teacher.dto.TeacherDTO;
import org.example.teacher.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teacher")
public class TeacherRestController {
@Autowired
TeacherService teacherService;

@GetMapping()
public List<TeacherDTO> getAllTeachers() {
    return teacherService.getAllTeachers();
}

@GetMapping("{id}")
    public TeacherDTO getTeacher(@PathVariable int id) {
        return teacherService.getTeacher(id);
    }

    @PostMapping()
    public TeacherDTO addTeacher(@RequestBody TeacherDTO teacherDTO) {
    return teacherService.addTeacher(teacherDTO);
    }

    @PutMapping("{id}")
    public TeacherDTO updateTeacher(@PathVariable int id, @RequestBody TeacherDTO teacherDTO) {

    return teacherService.updateTeacher(id, teacherDTO);
    }

    @DeleteMapping("{id}")
    public void deleteTeacher(@PathVariable int id) {
    teacherService.deleteTeacher(id);
    }

}
