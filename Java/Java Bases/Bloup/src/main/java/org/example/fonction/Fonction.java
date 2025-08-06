package org.example.fonction;

import java.util.Arrays;
import java.util.Scanner;

public class Fonction {
    public static int findMaxIntInArray(int[] intArray) {
        int max = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (i == 0) {
                max = intArray[i];
            }
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    public static void drawRectangle(int hauteur, int largeur) {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if (i == 0 || i == (hauteur - 1) || j == 0 || j == (largeur - 1)) {

                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static int getWordsAmount(String mots) {
        String[] mots2 = mots.split("\\s+");
        return mots2.length;
    }

    public static String[] filterWordsByLength(int minLength, String[] mots) {
        String result[] = new String[0];
        for (int i = 0; i < mots.length; i++) {
            if (mots[i].length() > minLength) {
                System.out.println(mots[i]);
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = mots[i];
            }
        }
        return result;
    }

    public static int gcdNonRecursive(int firstNumber, int secondNumber, int i) {
        int max = 0;
        if (i == 1) {
            return 1;
        }
        if (firstNumber % i == 0 && secondNumber % i == 0) {
            max = i;
            return max;
        } else {
            return gcdNonRecursive(firstNumber, secondNumber, i - 1);
        }
    }

    public static long getfacto(long number, long i) {
        if (i == 1) {
            return number;
        } else {
            number = number * i;
            return getfacto(number, i - 1);
        }


    }

    public static void getExo1() {

//findMaxIntInArray();
        Scanner imprimante = new Scanner(System.in);
        System.out.println("Ecrivez des nombres que vous voulez en les séparant par des espaces.");
        String nombres = imprimante.nextLine();
        String[] nombresEnString = nombres.split("\\s+");
        System.out.println(nombresEnString.length);
        int[] intArray = new int[nombresEnString.length];
        for (int i = 0; i < nombresEnString.length; i++) {
            intArray[i] = Integer.parseInt(nombresEnString[i]);
            System.out.println(intArray[i]);
        }
        System.out.println(findMaxIntInArray(intArray));
        imprimante.close();
    }

    public static void getExo2() {
        Scanner imprimante = new Scanner(System.in);
        System.out.println("dites moi la hauteur d'un rectangle désiré.");
        int hauteur = imprimante.nextInt();
        System.out.println("dites moi la largeur d'un rectangle désiré.");
        int largeur = imprimante.nextInt();
        drawRectangle(hauteur, largeur);
        imprimante.close();
    }

    public static void getExo3() {
        Scanner imprimante = new Scanner(System.in);
        System.out.println("Ecrivez des mots que vous voulez en les séparant par des espaces.");
        String mots = imprimante.nextLine();
        System.out.println(getWordsAmount(mots));
        imprimante.close();
    }

    public static void getExo4() {
        Scanner imprimante = new Scanner(System.in);
        System.out.println("Ecrivez des mots que vous voulez en les séparant par des espaces.");
        String mots = imprimante.nextLine();
        String[] mots2 = mots.split("\\s+");
        String[] result;
        System.out.println("Dis le nombre que tu veux. On va defoncer les mots qui sont avec un nombre de lettres inferieurs a ce nombre.");
        int nombre = imprimante.nextInt();

        filterWordsByLength(nombre, mots2);
        imprimante.close();
    }

    public static void getExo6() {
        Scanner imprimante = new Scanner(System.in);
        System.out.println("Ecrivez le nombre 1 : ");
        int nombre1 = imprimante.nextInt();
        System.out.println("Ecrivez le nombre 2 : ");
        int nombre2 = imprimante.nextInt();
        int i = 0;
        if (nombre1 > nombre2) {
            i = nombre2;
        } else {
            i = nombre1;
        }
        System.out.println(gcdNonRecursive(nombre1, nombre2, i));
        imprimante.close();
    }


    public static void exofacto() {
        Scanner imprimante = new Scanner(System.in);
        System.out.println("Ecrivez le nombre 1 : ");
        long nombre1 = imprimante.nextInt();
        long i = nombre1 -1;
        System.out.println(getfacto(nombre1, i));

    }
}

