package org.example.string;


import java.util.Arrays;
import java.util.Scanner;

public class Stringblab {

    public static void exoCount() {
        String test1 = "Je suis ton pere fils de pute.";
        String[] testo2 = test1.split("\\s+");
        int mots = testo2.length;
        System.out.println(mots);

    }

    public static void exoCountOccur() {
        String test1 = "Je suis ton pere fils de pute.";
        String test2 = "e";
        int cont = 0;
        char[] testchar = test1.toCharArray();
        for (int i = 0; i < testchar.length; i++) {
            if (String.valueOf(testchar[i]).contains(String.valueOf(test2))) {
                cont++;
            }
        }
        System.out.println(cont);
    }

    public static void exoAnagramme() {
        Scanner scanner = new Scanner(System.in);
        String mot1 = scanner.next();
        String mot2 = scanner.next();
        boolean test = true;

        mot1 = mot1.replaceAll("\\s", "").toLowerCase();
        mot2 = mot2.replaceAll("\\s", "").toLowerCase();

        if (mot1.length() != mot2.length()) {
            test = false;
        }

        char[] mot1Array = mot1.toCharArray();
        char[] mot2Array = mot2.toCharArray();
        Arrays.sort(mot1Array);
        Arrays.sort(mot2Array);

        boolean testTableaux = Arrays.equals(mot1Array, mot2Array);
        System.out.println(testTableaux);
        scanner.close();
    }

    public static void exoPalindrome() {
        Scanner scanner = new Scanner(System.in);
        String mot1 = scanner.next();
        boolean test = true;

        char[] mot1Array = mot1.toCharArray();
        System.out.println(mot1Array.length);

        int moitieLongueur = 0;
        char[] moitieArray = mot1Array;
        char[] moitieArray2 = mot1Array;


        if (mot1Array.length % 2 == 0) {
            moitieLongueur = mot1Array.length / 2;
            moitieArray = Arrays.copyOfRange(mot1Array, 0, moitieLongueur);
            moitieArray2 = Arrays.copyOfRange(mot1Array, moitieLongueur, mot1Array.length);
        } else {
            moitieLongueur = (mot1Array.length / 2) + 1;
            moitieArray = Arrays.copyOfRange(mot1Array, 0, moitieLongueur);
            moitieArray2 = Arrays.copyOfRange(mot1Array, moitieLongueur - 1, mot1Array.length);
        }

        System.out.println(moitieArray);
        System.out.println(moitieArray2);

        if (Arrays.equals(moitieArray, moitieArray2)) {
            test = false;
        } else {
            Arrays.sort(moitieArray);
            Arrays.sort(moitieArray2);
            System.out.println(moitieArray);
            System.out.println(moitieArray2);

            for (int i = 0; i < moitieArray.length; i++) {
                if (moitieArray[i] != moitieArray2[i]) {
                    test = false;
                    break;
                }
            }
        }
        if (test) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Nique ta grand mere");
        }
    }
}
