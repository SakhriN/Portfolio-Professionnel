package org.example.matiere.Service;

import org.example.matiere.Entity.Matiere;
import org.example.matiere.Repository.MatiereRepository;
import org.example.matiere.dto.MatiereDtoReceive;
import org.example.matiere.dto.MatiereDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MatiereService {

    @Autowired
    MatiereRepository matiereRepository;


    public MatiereDtoResponse save (MatiereDtoReceive matiereDtoReceive){
        Matiere matiere = dtoReceiveTOMatiere(matiereDtoReceive);
        matiereRepository.save(matiere);
        return matiereTODto(matiere);
    }

    public MatiereDtoResponse getById (long id){
        return  matiereTODto(matiereRepository.getReferenceById(id));
    }


    public Matiere dtoReceiveTOMatiere (MatiereDtoReceive matiereDtoReceive){
        return new Matiere(matiereDtoReceive.getNom(), matiereDtoReceive.getCoefficient());
    }
    public MatiereDtoResponse matiereTODto (Matiere matiere){
        return new MatiereDtoResponse(matiere.getId() ,matiere.getNom(), matiere.getCoefficient());
    }




}