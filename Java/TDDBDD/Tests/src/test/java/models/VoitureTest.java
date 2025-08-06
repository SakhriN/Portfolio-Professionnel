package models;

import org.example.models.Voiture;
import org.example.models.exceptions.RobertException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VoitureTest {


    Voiture voiture = new Voiture();


    @Test
    void TestBasique(){
        voiture.setCondition(12);
        voiture.setRentDueIn(12);
        voiture.setType("basique");
        voiture.dailyRoutine(voiture);
        Assertions.assertTrue(voiture.getCondition()==11&& voiture.getRentDueIn()==11);
    }

    @Test
    void TestBug(){
        voiture.setCondition(120);
        voiture.setRentDueIn(12);
        Assertions.assertThrowsExactly(RobertException.class,()->{voiture.dailyRoutine(voiture);});
    }

    @Test
    void TestOld(){
        voiture.setCondition(12);
        voiture.setRentDueIn(12);
        voiture.setType("ancienne");
        voiture.setOld(true);
        voiture.dailyRoutine(voiture);
        Assertions.assertTrue(voiture.getCondition()==10 && voiture.getRentDueIn()==11);
    }

    @Test
    void TestLuxe(){
        voiture.setCondition(12);
        voiture.setRentDueIn(12);
        voiture.setType("luxe");
        voiture.dailyRoutine(voiture);
        Assertions.assertTrue(voiture.getCondition()==13);
    }
}
