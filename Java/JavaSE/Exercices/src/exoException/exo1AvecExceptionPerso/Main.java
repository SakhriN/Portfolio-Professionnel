package exoException.exo1AvecExceptionPerso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner daredevil = new Scanner(System.in);
        try{
            System.out.println("Ecris une chaine de caracteres");
            int caca = Integer.parseInt(daredevil.nextLine());
        }catch(NumberFormatException ex){
            ex.printStackTrace();
            System.out.println("Ta grand mere");
        }
    };
}

