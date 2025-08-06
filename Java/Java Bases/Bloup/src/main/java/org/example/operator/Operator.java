package org.example.operator;

import java.util.Scanner;

public class Operator {

    public static void exo22() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nombre = scanner.nextInt();
        nombre = nombre * nombre;
        System.out.println("Le nombre au carré est " + nombre + " !");
        scanner.close();
    }

    public static void exo23() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = scanner.nextLine();
        System.out.println("Bonjour, " + nom + "!");
        scanner.close();
    }

    public static void exo24() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez prix Hors Taxe : ");
        int prixHT = scanner.nextInt();
        System.out.print("Insérez nombre d'articles : ");
        int nbArticle = scanner.nextInt();
        System.out.print("Insérez la TVA de l'article en pourcent (%) et non a virgule : ");
        float TVA = scanner.nextFloat();

        float prixTTC = (prixHT + prixHT * (TVA / 100)) * nbArticle;
        System.out.println("Prix hors taxe :" + prixHT + "\nNombre d'article : " + nbArticle + "\n TVA : " + TVA + " %.");
        System.out.println("Bonjour, le prix du ou des articles en incluant la TVA est de :" + prixTTC + " !");
        scanner.close();
    }

    public static void exo31() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez un nombre et vous saurez si il est positif, négatif ou neutre : ");
        float nombre = scanner.nextFloat();
        if (nombre < 0) {
            System.out.println("Le nombre :" + nombre + " est négatif !");
        } else {
            System.out.println("Le nombre :" + nombre + " est positif !");
        }
        scanner.close();
    }

    public static void exo32() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez premier nombre : ");
        float nombre1 = scanner.nextFloat();
        System.out.print("Insérez premier nombre : ");
        float nombre2 = scanner.nextFloat();
        String valeur1;
        String valeur2;

        if (nombre1 < 0) {
            valeur1 = "négatif";
        } else if (nombre1 > 0) {
            valeur1 = "positif";
        } else {
            valeur1 = "neutre";
        }


        if (nombre2 < 0) {
            valeur2 = "négatif";
        } else if (nombre2 > 0) {
            valeur2 = "positif";
        } else {
            valeur2 = "neutre";
        }

        if (valeur1 != valeur2 && valeur1 != "neutre" && valeur2 != "neutre") {
            System.out.println("Valeur du produit des 2 nombres : négatif !");
        } else if (valeur1 == valeur2 && valeur1 != "neutre" && valeur2 != "neutre") {
            System.out.println("Valeur du produit des 2 nombres : positif !");
        } else if (valeur1 == "neutre") {
            System.out.println("Valeur du produit des 2 nombres : neutre !");
        } else if (valeur2 == "neutre") {
            System.out.println("Valeur du produit des 2 nombres : neutre !");
        }
        scanner.close();
    }


    public static void exo33() {

    }

    public static void exo34() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez un nombre et vous saurez si il est positif, négatif ou neutre : ");
        float nombre = scanner.nextFloat();
        if (nombre < 0) {
            System.out.println("Le nombre :" + nombre + " est négatif !");
        } else if (nombre > 0) {
            System.out.println("Le nombre :" + nombre + " est positif !");
        } else {
            System.out.println("Le nombre :" + nombre + " est neutre !");
        }
        scanner.close();
    }

    public static void exo35() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donnez l'age de votre enfant : ");
        int age = scanner.nextInt();
        String reponse;

        if (age < 6) {
            reponse = "niquer ta soeur";
        } else if (age == 6 || age == 7) {
            reponse = "en Poussin";
        } else if (age == 8 || age == 9) {
            reponse = "en Pupille";
        } else if (age == 10 || age == 11) {
            reponse = "en Minime";
        } else {
            reponse = "en Cadet";
        }
        System.out.println("Ton enfant peut aller : " + reponse);

    }

    public static void exo36() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez un nombre et nous vous dirons si il est divisible par 3 : ");
        int nombre = scanner.nextInt();
        if (nombre % 3 == 0) {
            System.out.print("Le nombre : " + nombre + " est divisible par 3.");
        } else {
            System.out.print("Le nombre : " + nombre + " n'est pas divisible par 3.");
        }
    }

    public static void exo37() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insérez le nombre de photocopie que vous devrez payer et nous vous dirons le prix des photocopies : ");
        int nombre = scanner.nextInt();

        if (nombre < 10) {
            float prix = nombre * 0.15f;
            System.out.println("Prix : " + nombre + " x 0.15 = " + prix + "euros.");
        } else if (nombre >= 10 && nombre <= 20) {
            float prix = nombre * 0.10f;
            System.out.println("Prix : " + nombre + " x 0.10 = " + prix + "euros.");
        } else {
            float prix = nombre * 0.05f;
            System.out.println("Prix : " + nombre + " x 0.05 = " + prix + " euros.");
        }
    }


    public static void exo51() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne un nombre compris entre 1 et 3 :");
        int nombre = scanner.nextInt();
        while (nombre < 1 || nombre > 3) {
            if (nombre > 3) {
                System.out.println("Tu sais pas lire ou quoi ? Entre 1 et 3 ! Réécris");
                nombre = scanner.nextInt();
            } else {
                System.out.println("Tu sais pas lire ou quoi ? Entre 1 et 3 ! Réécris");
                nombre = scanner.nextInt();
            }
        }
        System.out.println("Le nombre écrit est : " + nombre + ", bien joué.");
    }

    public static void exo52() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne un nombre compris entre 10 et 20 :");
        int nombre = scanner.nextInt();
        while (nombre < 10 || nombre > 20) {
            if (nombre > 20) {
                System.out.println("Plus petit, batard !");
            } else {
                System.out.println("Plus grand, fdp !");
            }
            nombre = scanner.nextInt();
        }
        System.out.println("Le nombre écrit est : " + nombre + ", bien joué.");
    }

    public static void exo53() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne un nombre au depart :");
        int nombre = scanner.nextInt();
        int i = 0;
        while (i < 10) {
            nombre = nombre + 1;
            System.out.println(nombre + "\n");
            i++;
        }
        scanner.close();
    }

    public static void exo54() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne un nombre au depart :");
        int nombre = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            nombre = nombre + 1;
            System.out.println(nombre + "\n");
        }
        scanner.close();
    }

    public static void exo55() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne un nombre au depart :");
        int nombre = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            int multiply = i * nombre;
            System.out.println(nombre + " x " + i + " = " + multiply + ".\n");
        }
        scanner.close();
    }

    public static void exo56() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne un nombre au depart :");
        int nombre = scanner.nextInt();
        int somme = 0;
        for (int i = 0; i <= nombre; i++) {
            somme = somme + i;
        }
        System.out.println("la somme de tous les entiers jusqu'a " + nombre + " est de : " + somme);
        scanner.close();
    }

    public static void exo57() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez 20 notes :");
        int nombre = 0;
        int notemax = 0;
        for (int i = 0; i < 20; i++) {
            nombre = scanner.nextInt();
            if (i == 0) {
                notemax = nombre;
            } else {
                if (nombre > notemax) {
                    notemax = nombre;
                }
            }
        }
        System.out.println("note max = " + notemax + "\n");
        scanner.close();
    }

    public static void exo572() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez 20 notes :");
        int nombre = 0;
        int notemax = 0;
        int posmax = 0;

        for (int i = 0; i < 20; i++) {
            int numnote = i + 1;
            System.out.println("Note " + numnote + " : ");
            nombre = scanner.nextInt();
            if (i == 0) {
                notemax = nombre;
                posmax = numnote;
            } else {
                if (nombre > notemax) {
                    notemax = nombre;
                    posmax = numnote;
                }
            }
        }
        System.out.println("note max = " + notemax + ", ecrit dans la position numéro " + posmax + ".\n");
        scanner.close();
    }

    public static void exo58() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne un nombre au depart :");
        int nombre = scanner.nextInt();
        int multiply = 1;
        for (int i = 1; i <= nombre; i++) {
            multiply = multiply * i;
        }
        System.out.println("la multiplication de tous les entiers jusqu'a " + nombre + " est de : " + multiply);
        scanner.close();
    }

    public static void exo59() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez beaucoup de notes :");
        int nombre = 1;
        int notemax = 0;
        int posmax = 0;
        int i = 0;
        while (nombre != 0) {
            int numnote = i + 1;
            System.out.println("Note " + numnote + " : ");
            nombre = scanner.nextInt();
            if (nombre != 0) {
                if (i == 0) {
                    notemax = nombre;
                    posmax = numnote;
                } else {
                    if (nombre > notemax) {
                        notemax = nombre;
                        posmax = numnote;
                    }
                }
                i++;
            }
        }
        System.out.println("note max = " + notemax + ", ecrit dans la position numéro " + posmax + ".\n");
        scanner.close();
    }

    public static void exo510() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez beaucoup de factures :");
        int nombre = 1;
        int sommeaPayer = 0;
        int i = 0;
        int billet10 = 0;
        int billet5 = 0;
        int piece1 = 0;

        while (nombre != 0) {
            int numnote = i + 1;
            System.out.println("Facture " + numnote + " : ");
            nombre = scanner.nextInt();
            sommeaPayer = sommeaPayer + nombre;
            i++;
        }
        System.out.println(" Vous devez " + sommeaPayer + " euros.\n Dites maintenant combien vous payez :");
        nombre = scanner.nextInt();
        while (nombre < 0) {
            System.out.println("Te fout pas de la gueule du monde. Donne un nombre positif.");
            nombre = scanner.nextInt();
        }
        sommeaPayer = sommeaPayer - nombre;
        if (sommeaPayer < 0) {
            sommeaPayer = sommeaPayer * (-1);
            System.out.println("On vous doit :" + sommeaPayer + " euros.");
            if (sommeaPayer > 10) {
                billet10 = sommeaPayer / 10;
                sommeaPayer = sommeaPayer - billet10 * 10;
            }
            if (sommeaPayer > 5) {
                billet5 = sommeaPayer / 5;
                sommeaPayer = sommeaPayer - billet5 * 5;
            }
            if (sommeaPayer >= 1) {
                piece1 = sommeaPayer;
                sommeaPayer = sommeaPayer - sommeaPayer;
            }
            System.out.println("On vous doit :" + billet10 + " billets de 10 euros, " + billet5 + " billets de 5 euros et " + piece1 + " pieces de 1 euro.");

        } else if (sommeaPayer > 0) {
            System.out.println("Vous nous devez :" + sommeaPayer + " euros.");
        } else {
            System.out.println("Vous nous devez rien et inversement !");
        }
        scanner.close();
    }

    public static void exo511() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        int somme = 0;
        int i = 0;
        while (somme < 100) {
            i++;
            somme = somme + i;
            nombre = i;
        }
        System.out.println(nombre + " est le premier nombre entier N tel que la somme de 1 a N dépasse 100, somme qui vaut : " + somme);
        scanner.close();
    }

    public static void exov51() {
        int[] tab = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 2, 2, 2, 2, 2, 2, 1, 2};
        int nbr = 2;
        int count = 0;
        for (int i = 0; i < (tab.length); i++) {
            if (tab[i] == nbr) {
                count++;
            }
        }
        System.out.println("Valeur :" + nbr + ",\n Nombre d'occurrences : " + count);
    }

    public static void exov52() {
        int[] tab = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 2, 2, 2, 2, 2, 2, 1, 2};
        boolean bool = false;
        for (int i = 0, j = i + 1; i < (tab.length - 1); i++, j++) {
            if ((tab[j] - tab[i]) >= 0) {
                bool = true;
            } else {
                bool = false;
                break;
            }
        }
        if (bool == true) {
            System.out.println("tableau trié par ordre croissant");
        } else {
            System.out.println("tableau pas trié par ordre croissant");
        }
    }

    public static void exov53() {
        int[] tab = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 2, 2, 2, 2, 2, 75, 1, 2};
        boolean bool = false;
        int ecart = 0;
        int pos1 = 0;
        int pos2 = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (i == j) {
                    continue;
                }
                if ((tab[j] - tab[i]) > ecart) {
                    ecart = tab[j] - tab[i];
                    pos1 = i + 1;
                    pos2 = j + 1;
                }
            }

        }
        System.out.println("Le plus grand écart est de :" + ecart + ",\n causé par l'écart entre la position numéro " + pos1 +
                " et la position numéro " + pos2 + " .");
    }

    public static void exov55() {
        int tab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int newtab[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < tab.length; i++) {
            newtab[i] = tab[tab.length - 1 - i];
            System.out.println(newtab[i]);
        }
    }

    public static void exov56() {
        int tableau[] = {1, 12, 16, 13, 15, 12, 10, 8, 4, 9, 7, 5};
        int n = tableau.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (tableau[j] < tableau[minIndex]) {
                    minIndex = j;
                }
            }

            // Échanger l'élément minimum avec le premier élément non trié
            int temp = tableau[minIndex];
            tableau[minIndex] = tableau[i];
            tableau[i] = temp;
        }
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }

    public static void exov57() {
        int tableau[] = {1, 12, 16, 13, 15, 12, 10, 8, 4, 9, 7, 5};
        int i = 0;
        boolean bool = true;
        while (bool) {
            bool = false;
            for (i = 0; i < (tableau.length - 1); i++) {

                if (tableau[i] > tableau[i + 1]) {
                    int temp = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = temp;
                    bool = true;
                }
            }
        }

        for (i = 0; i < tableau.length - 1; i++) {
            System.out.println(tableau[i]);
        }

    }

    public static void exov58() {
        int tableau1[] = {11, 12, 16, 13, 15, 12, 10, 8, 4, 9, 7, 5};
        int tableau2[] = {4, 0, 12, 0, 121, 1, 3, 7, 4, 9, 7, 5};

        if (tableau1.length == tableau2.length) {
            for (int i = 0; i <tableau1.length; i++) {
                int[] somme = new int[tableau1.length];
                somme[i] = tableau1[i] + tableau2[i];
                System.out.println(somme[i]);
            }
        }else{
            System.out.println("les tableaux ne sont pas de la meme dimension.");
        }


    }
}