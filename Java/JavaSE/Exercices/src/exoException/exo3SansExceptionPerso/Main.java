package exoException.exo3SansExceptionPerso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner daredevil = new Scanner(System.in);
        int probleme = 1;
        int[] tableau = {1,2,3,4,5};
        int choix;
        while (probleme != 0) {
            try {
                System.out.println("on a un tableau avec 5 valeurs, quelle valeur voulez vous récupérer ?");
                String car = daredevil.nextLine();
                choix = Integer.parseInt(car);
                System.out.println("La valeur numéro " + choix + " du tableau est : " +  (tableau[choix- 1]));
                probleme = 0;
            }catch(NumberFormatException | ArrayIndexOutOfBoundsException ex){
                ex.printStackTrace();

            }
        }
        System.out.println("Au revoir.");
    }
}
