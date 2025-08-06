package models;
import org.example.models.exceptions.NotFoundException;
import org.example.models.Villes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VillesTest {
    Villes villes = new Villes();



    @Test
    void Detection(){
        Assertions.assertThrowsExactly(NotFoundException.class,()->villes.rechercherVillesContenant("a"));
    }

    @Test
    void VillesParDebut() {
        List<String> villesList;
        villesList = villes.rechercherVillesParDebut("a");
        List<String> test = Arrays.asList("Valence","Vancouver");
        Assertions.assertTrue(test.equals(villesList));
    }

    @Test
    void VillesContenant() {
        List<String> villesList;
        villesList = villes.rechercherVillesContenant("ape");
        List<String> test = Arrays.asList("Budapest");
        Assertions.assertTrue(test.equals(villesList));
    }

}
