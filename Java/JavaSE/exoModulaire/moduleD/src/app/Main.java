package app;

import myJustice.Policier;
import myProbleme.AbusDautorite;

public class Main {
    public static void main(String[] args) {

        Policier policier = new Policier("Sakhri", "Nassim", 1234);
        AbusDautorite abusDautorite = new AbusDautorite("Matraque dans le cul", policier);


        System.out.println(abusDautorite.toString());


    }
}