package exoCalculatrice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Calculatrice {
    static double reponse=0;
    static int choix = 12;
    static double Ra,Rb;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator multiplie = (a,b) -> a*b ;
        Calculator divise = (a,b) -> a/b ;
        Calculator additionne = (a,b) -> a+b ;
        Calculator soustrait = (a,b) -> a-b ;

        Map<String,Double> opérations = new HashMap<>();
        opérations.put("multiplie",multiplie.calculate(Ra,Rb));
        opérations.put("divise",divise.calculate(Ra,Rb));
        opérations.put("additionne",additionne.calculate(Ra,Rb));
        opérations.put("multiplie",soustrait.calculate(Ra,Rb));


        Consumer<String> printMessage = (message)->{
            System.out.println(message);
        };
        System.out.println("Bonjour, merci de faire votre choix : ");

        while(choix!=0){
            System.out.println("1. Multiplication.\n" +
                    "2. Division.\n" +
                    "3. Addition.\n" +
                    "4. Soustraction.\n" +
                    "0. Sortir de ce super programme.");
            choix = sc.nextInt();
            sc.nextLine();

            switch(choix){
                case 1->{
                    bloup(sc,Ra,Rb);
                    reponse = multiplie.calculate(Ra,Rb);
                    System.out.println(reponse);
                    printMessage.accept(Ra + " x " + Rb + " = " + reponse);
                }
                case 2->{
                    bloup(sc,Ra,Rb);
                    while(Rb==0){
                        System.out.println("Tu va réecrire la 2eme variable sinon je te défonce");
                        Rb=sc.nextDouble();
                        sc.nextLine();
                    }
                    reponse = divise.calculate(Ra,Rb);
                    printMessage.accept(Ra + " / " + Rb + " = " + reponse);
                }
                case 3->{
                    bloup(sc,Ra,Rb);
                    reponse = additionne.calculate(Ra,Rb);
                    printMessage.accept(Ra + " + " + Rb + " = " + reponse);
                }
                case 4->{
                    bloup(sc,Ra,Rb);
                    reponse = soustrait.calculate(Ra,Rb);
                    printMessage.accept(Ra + " - " + Rb + " = " + reponse);
                }
                case 999999->{
for (int ir=0; ir<1000000;ir++){
    System.out.println("SECRET DEFENSE!!!SECRET DEFENSE!!!SECRET DEFENSE!!!SECRET DEFENSE!!!SECRET DEFENSE!!!SECRET DEFENSE!!!SECRET DEFENSE!!!");
                    }
                }
                default ->{
                    if (choix!=0){
                        System.out.println("Nique ta grand mère.");
                    }else{
                        System.out.println("Au revoir.");
                    }

                }
            }
        }

sc.close();
    }

    public static void bloup(Scanner scanner, double a , double b){
        System.out.println("Entrez la première valeur : ");
        Ra=scanner.nextDouble();
        System.out.println("Entrez la deuxième valeur : ");
        Rb=scanner.nextDouble();
        scanner.nextLine();
    }

}


