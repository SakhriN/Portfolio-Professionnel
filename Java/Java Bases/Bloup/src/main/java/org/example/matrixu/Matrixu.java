package org.example.matrixu;

import java.util.Scanner;

public class Matrixu {


    public static void Exo8_1() {
        int[][] bloup = {{45, 23, 34, 56, 30}, {67, 75, 21, 52, 59}, {89, 34, 19, 19, 15}, {1, 78, 90, 48, 42}};
        int max = 0;
        for (int i = 0; i < bloup.length; i++) {
            for (int j = 0; j < bloup[i].length; j++) {
                if (bloup[i][j] > max) {
                    max = bloup[i][j];
                }
            }
        }
        System.out.println("le max dans le tableau de valeurs est : " + max);
    }

    public static void Exo8_2() {
        int[][] bloup = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int count = 1;
        int somme = 0;
        long produit = 1;
        float moyenne = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                bloup[i][j] = count;
                moyenne = count;
                somme = somme + count;
                produit = produit * count;
                System.out.println(bloup[i][j]);
                count++;
            }
        }
        System.out.println("La somme est de : " + somme);
        System.out.println("Le produit est de : " + produit);
        moyenne = somme / moyenne;
        System.out.println("La moyenne est de : " + moyenne);
    }

    public static void Exo8_3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre de marques de véhicules : ");
        int nombreMarques = scanner.nextInt();
        System.out.print("Entrez le nombre de vendeurs : ");
        int nombreVendeurs = scanner.nextInt();

        int[][] ventes = new int[nombreVendeurs][nombreMarques];

        String[] marques = new String[nombreMarques];
        for (int i = 0; i < nombreMarques; i++) {
            System.out.print("Entrez le nom de la marque #" + (i + 1) + " : ");
            marques[i] = scanner.next();
        }

        String[] nomsVendeurs = new String[nombreVendeurs];
        for (int i = 0; i < nombreVendeurs; i++) {
            System.out.print("Entrez le nom du vendeur #" + (i + 1) + " : ");
            nomsVendeurs[i] = scanner.next();
        }

        for (int i = 0; i < nombreVendeurs; i++) {
            for (int j = 0; j < nombreMarques; j++) {
                System.out.print("Entrez le nombre de véhicules vendus par "
                        + nomsVendeurs[i] + " pour la marque " + marques[j] + " : ");
                ventes[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < nombreVendeurs; i++) {
            System.out.println(nomsVendeurs[i] + " : ");
            for (int j = 0; j < nombreMarques; j++) {
                System.out.println(marques[i] + " : " + ventes[i][j]);
            }
        }





        scanner.close();
    }
}
