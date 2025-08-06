package org.example.poo.bibliotheque;

public class Gerant {

    public static void main(String[] args) {

        Personne personne1 = new Personne("Jospin","Remi");
        Personne personne2 = new Personne("Sakhri","Nassim");

        LivrePapier Livre = new LivrePapier("Dormir en 75 étapes","Stephen Hawking",69,"Maison de fou");
        LivreNumerique bloc = new LivreNumerique("Le poker pour les nuls","Nassim Sakhri","7zip",1000000000);
        Bibliotheque test = new Bibliotheque();

        test.ajouterLivre(Livre);
        System.out.println(test.trouverLivresParTitre("Dormir"));
    }
}
