package org.example.exceptions;

import java.util.Scanner;

public class Exceptionexo {
    public static void main(String[] args) {

        //exo1

        Scanner scanner1 = new Scanner(System.in);
        int nb1 = scanner1.nextInt();
        int nb2 = scanner1.nextInt();
        int resultat = 0;
        try {
            resultat = nb1 / nb2;
        } catch (ArithmeticException e) {
            System.out.println("T'es mauvais, erreur de batard : " + e);
        }
        System.out.println(resultat);


        //exo2
        System.out.println("Ecris tout ce que tu veux, tant que ce sont des chiffres");
        scanner1.nextLine();
        String testString = scanner1.nextLine();
        int testnum = 0;
        try {
            testnum = Integer.parseInt(testString);
        } catch (NumberFormatException e) {
            System.out.println("FDP, ton erreur : " + e);
        }
        System.out.println("Bravo, ton chiffre c'est : " + testnum);


        //exo3
        int[] tablo = new int[5];
        System.out.println("quelle valeur du tableau voulez voir ?");
        int choix = scanner1.nextInt();

        try {
            System.out.println(tablo[choix - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("tu pue sa mere, casse toi de l'ordinateur, " + e);
        }

        //exo4
        int montant = 5000;
        System.out.printf("Bonjour vous avez %d dans votre compte courant, combien voulez-vous retirer ?\n", montant);
        int enlevement = scanner1.nextInt();
        if(enlevement>montant){
            SoldeInsuffisantException name = new SoldeInsuffisantException("Loser");
            System.out.println(name);
        }
        int resultat2 = montant - enlevement;
        System.out.printf("Bien joué, tu as désormais %d euros.", resultat2);
    }
}
