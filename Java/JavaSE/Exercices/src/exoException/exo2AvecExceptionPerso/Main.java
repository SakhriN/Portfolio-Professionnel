package exoException.exo2AvecExceptionPerso;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner daredevil = new Scanner(System.in);
        int probleme = 1;

        while (probleme != 0) {
            try{
                System.out.println("Ecris un nombre/chiffre positif : ");
int a = Integer.parseInt(daredevil.nextLine());
if (a<=0){
    throw new NullPointerException("Chiffre a 0 ou negatif, franchement tu te fous vraiment de la gueule du monde,\n T'en es fier en plus ? A cause de toi, un magicarpe fait trempette dans un univers parallèle.");
}
double reponse = Math.sqrt(a);
                System.out.println("La racine carré de "+a+ " est de : " + reponse);
                probleme = 0;
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Au revoir.");
    }
}
