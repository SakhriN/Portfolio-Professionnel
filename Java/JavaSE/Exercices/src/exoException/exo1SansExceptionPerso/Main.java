package exoException.exo1SansExceptionPerso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner daredevil = new Scanner(System.in);
        int probleme = 1;
        while (probleme != 0) {
            try{
                System.out.println("Ecris une chaine de caracteres");
                int caca = Integer.parseInt(daredevil.nextLine());
                System.out.println("Bravo, ta mis un chiffre.");
                probleme = 0;
            }catch(NumberFormatException ex){
                ex.printStackTrace();
                System.out.println("Ta grand mere");
            }
        }
        System.out.println("Au revoir.");
    };
}

