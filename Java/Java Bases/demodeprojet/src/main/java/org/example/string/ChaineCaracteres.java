package org.example.string;

import java.util.Arrays;

public class ChaineCaracteres {
    public static void getMethodString() {

String s = " Hello ";

        System.out.println("s.length() " + s.length());
        System.out.println("s.contains(\"he\") : " + s.contains("he"));
        System.out.println("s.isEmpty : " + s.isEmpty());
        System.out.println("s.touppercase : " + s.toUpperCase());
        System.out.println("s.startwith(\"h\" : )" + s.startsWith("h"));
        System.out.println("s.endwith(\" \" : " + s.endsWith(" "));
        System.out.println("s.replace(\"ll\", \"LL\") " + s.replace("ll","LL"));
        System.out.println("s.trim() " + s.trim() );
        System.out.println("s.substring(0,3) "+ s.substring(0,3));
        System.out.println("Arrays.tostring(s.split\"e\") : " + Arrays.toString(s.split("e")));
        System.out.println(s);

    }

        public static void getFormatString(){
            String firstname = "Alain";
            String phrase = "Bonjour %s !! Good %s !!!";
            String salope = "Bitch";

            String nouvellePhrase = String.format(phrase,firstname,salope);
                System.out.println(nouvellePhrase);

                System.out.printf("Vous allez gagner %d salopes tous les %d minutes.", 1010130,931491);


                String nomProduit = "Chocolatine";
                double prix = 2.99;
                int quantite = 10;

                System.out.printf("total pour %d de %s : %.2f euros ", quantite,nomProduit,prix*quantite);
        }
}
