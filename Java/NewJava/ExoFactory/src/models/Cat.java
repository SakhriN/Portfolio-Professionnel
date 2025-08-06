package models;

public class Cat implements Animal{


    @Override
    public void makeSound() {
        int random = (int) (Math.random() * 3);

        switch (random){
            case 0->{
                System.out.println("Meow");
            }
            case 1->{
                System.out.println("Miaou");
            }
            default -> {
                System.out.println("Meooooow");
            }
        }
    }



    @Override
    public void takeAShit() {
        int random = (int) (Math.random() * 5);

        switch (random) {
            case 0->{
                System.out.println("Putain, le chat a chié sur le mur");
            }
            case 1->{
                System.out.println("Le chat a chié dans la litière");
            }
            case 2->{
                System.out.println("Le chat a chié sur la table");
            }
            case 3->{
                System.out.println("Le chat a chié en courant");
            }
            default -> {
                System.out.println("Le chat t'a chié dessus !!!!");
            }
        }
    }

    @Override
    public void IsAlive() {
        int random = (int) (Math.random() * 5);

        switch (random) {
            case 0->{
                System.out.println("Le chat a survécu de son action précédente.");
            }
            case 1->{
                System.out.println("Le chat en est mort.");
            }
            case 2->{
                System.out.println("Le chat est porté disparu suite a sa dernière action.");
            }
            case 3->{
                System.out.println("Le chat a été piqué.");
            }
            default->{
                System.out.println("Cherche ton chat, oh. Je n'ai pas développé ce programme pour le chercher a ta place.");
            }
        }
    }

}
