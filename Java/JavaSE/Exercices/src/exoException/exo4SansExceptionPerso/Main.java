package exoException.exo4SansExceptionPerso;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner daredevil = new Scanner(System.in);
        int probleme = 1;
        List<Etudiant> etudiants = new ArrayList<Etudiant>();
        while (probleme != 0) {
            try{
                System.out.println("Veuillez saisir votre nom : ");
                String nom = daredevil.nextLine();
                System.out.println("Veuillez saisir votre age : ");
                int age = Integer.parseInt(daredevil.nextLine());
                if (age <0) {
                    throw new InvalidAgeException("Genre t'es pas né tu veux nous rejoindre.");
                }
                if (age==0){
                    throw new InvalidAgeException("On accepte pas les bébés.");
                }
                if (age>=100){
                    throw new InvalidAgeException("T'es mort, la.");
                }
                etudiants.add(new Etudiant(nom, age));
                System.out.println(etudiants);
                probleme = 0;
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Au revoir.");
    }
}
