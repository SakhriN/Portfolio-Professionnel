package org.example.operateur2;

public class Operateur2 {

    public static void boucleFor() {

        int[] tab = {1,5,6};
        int sum = 0;
        int i, j;

        for ( i = 0; i < tab.length; i++) {
            System.out.println(" i = " + i + ", valeur tab " + tab[i]);

        }
        for ( i = 0, j=10; i < j; i++, j--) {
            System.out.println(" i = " + i + " j = " + j );

        }
        System.out.println("le i vaut mtn : " + i + ", le j vaut aussi : " + j );
    }
}
