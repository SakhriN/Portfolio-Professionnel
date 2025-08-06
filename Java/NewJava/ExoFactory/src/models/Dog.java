package models;

public class Dog implements Animal{



    @Override
    public void makeSound() {
        int random = (int) (Math.random() * 3);

        switch (random){
            case 0->{
                System.out.println("Wouf");
            }
            case 1->{
                System.out.println("Waf");
            }
            default -> {
                System.out.println("Wof, Wof Wof !!!");
            }
        }
    }

    @Override
    public void takeAShit() {
        int random = (int) (Math.random() * 5);

        switch (random) {
            case 0->{
                System.out.println("Putain, le chien a chié sur le canapé");
            }
            case 1->{
                System.out.println("Le chien a chié devant la porte");
            }
            case 2->{
                System.out.println("Le chien a chié sur la table");
            }
            case 3->{
                System.out.println("Le chien a chié en courant");
            }
            default -> {
                System.out.println("Le chien t'a chié dessus !!!!");
            }
        }
    }

    @Override
    public void IsAlive() {
        int random = (int) (Math.random() * 5);

        switch (random) {
            case 0->{
                System.out.println("Le chien a survécu de son action précédente.");
            }
            case 1->{
                System.out.println("Le chien en est mort.");
            }
            case 2->{
                System.out.println("Le chien est porté disparu suite a sa dernière action.");
            }
            case 3->{
                System.out.println("Le chien a été piqué.");
            }
            default->{
                System.out.println("Cherche ton chien, oh. Je n'ai pas développé ce programme pour le chercher a ta place.");
            }
        }
    }
}
