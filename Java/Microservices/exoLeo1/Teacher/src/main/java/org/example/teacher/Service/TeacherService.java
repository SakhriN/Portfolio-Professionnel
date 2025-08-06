package org.example.teacher.Service;

import org.example.teacher.Entity.Teacher;
import org.example.teacher.Repository.TeacherRepository;
import org.example.teacher.dto.Matiere;
import org.example.teacher.dto.TeacherDtoReceive;
import org.example.teacher.dto.TeacherDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.teacher.tools.RestClient;
import java.time.LocalDate;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public TeacherDtoResponse save (TeacherDtoReceive teacherDtoReceive){
        Teacher teacher = dtoReceiveTOTeacher(teacherDtoReceive);
         teacherRepository.save(teacher);
        return teacherTODto(teacher);
    }

    public TeacherDtoResponse getById (long id){
        return  teacherTODto(teacherRepository.getReferenceById(id));
    }



    public Teacher dtoReceiveTOTeacher (TeacherDtoReceive teacherDtoReceive){
        return new Teacher(teacherDtoReceive.getFirstname(), teacherDtoReceive.getLastname(), LocalDate.parse(teacherDtoReceive.getBirthDateStr()), teacherDtoReceive.getSubject(),teacherDtoReceive.getIdMatiere());
    }
    public TeacherDtoResponse teacherTODto (Teacher teacher){
        Matiere matiere = null;

        RestClient<Matiere> matiereRestClient = new RestClient<>("http://localhost:8085/api/matiere/");
        matiere = matiereRestClient.getRequest(Matiere.class,teacher.getIdMatiere().toString());

        return new TeacherDtoResponse(teacher.getId() ,teacher.getFirstname(),teacher.getLastname(), teacher.getBirthDate(),teacher.getSubject(),matiere);
    }

}
