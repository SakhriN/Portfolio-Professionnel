package org.example.models;

import org.example.models.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Villes {

    private List<String> nomsVilles = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam",
            "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");

    public List<String> rechercherVillesParDebut(String texteRecherche) {
        texteRecherche = texteRecherche.toLowerCase();
        List<String> resultats = new ArrayList<>();
        if (texteRecherche.equals("*")) {
            for (String nomVille : nomsVilles) {
                resultats.add(nomVille);
            }
        } else {
            if (texteRecherche.length() < 2) {
                throw new NotFoundException("Le texte de recherche doit contenir au moins 2 caractères.");
            } else {
                for (String nomVille : nomsVilles) {
                    if (nomVille.toLowerCase().startsWith(texteRecherche)) {
                        resultats.add(nomVille);
                    }
                }
            }
        }
        return resultats;
    }

    public List<String> rechercherVillesContenant(String texteRecherche) {
        texteRecherche = texteRecherche.toLowerCase();
        List<String> resultats = new ArrayList<>();
        if (texteRecherche.equals("*")) {
            for (String nomVille : nomsVilles) {
                resultats.add(nomVille);
            }
        } else {
            if (texteRecherche.length() < 2) {
                throw new NotFoundException("Le texte de recherche doit contenir au moins 2 caractères.");
            } else {
                for (String nomVille : nomsVilles) {
                    if (nomVille.toLowerCase().contains(texteRecherche)) {
                        resultats.add(nomVille);
                    }
                }
            }
        }
        return resultats;
    }

}