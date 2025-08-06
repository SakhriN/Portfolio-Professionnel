package org.example.poo.bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {

    ArrayList<Livre> Librairie;


    public Bibliotheque() {
this.Librairie = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        Librairie.add(livre);
    }

    public void supprimerLivre(int id) {
        Librairie.remove(id);
    }

    public ArrayList<Livre> trouverLivresParTitre(String title) {
        ArrayList<Livre> bougougou= new ArrayList<>();
        for (Livre tagrandmere : Librairie) {
            if (tagrandmere.title.contains(title)) {
                bougougou.add(tagrandmere);
            }
        }
        return bougougou;
    }
}
