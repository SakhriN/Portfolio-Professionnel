package org.example.collections;

import java.util.ArrayList;

public class Liste {

    public static void main(String[] args) {


        ArrayList<String> prenoms = new ArrayList<String>();

        prenoms.add("toto");
        prenoms.add("tata");
        prenoms.add("titi");


        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        System.out.println("je change tata pour Nassim, du coup :");
        prenoms.set(1, "Nassim");
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        System.out.println(prenoms.size());


        System.out.println("Meurs sale chien de " + prenoms.get(1) + " !!!!!!!");
        prenoms.remove(1);
        System.out.println(prenoms.size());
        System.out.println("les survivants sont :");

        for (String prenom : prenoms) {
            System.out.println(prenom);
        }

    }
}
