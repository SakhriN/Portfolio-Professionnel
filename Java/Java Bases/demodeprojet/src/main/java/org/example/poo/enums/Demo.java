package org.example.poo.enums;

public class Demo {
    public static void main(String[] args) {
        Priority priority = Priority.LOW;
var labagarre = "bjezfbkejgbz";
var blouge = 12;
Object any = "je suis le meilleur dresseur du monde";
        System.out.println(any);
        any = 12;
        System.out.println(any);

        switch (priority) {
            case HIGH:
                System.out.println("FDP");
                break;
            case MEDIUM:
                System.out.println("Salope");
                break;
            case LOW:
                System.out.println("Bg de fou");
                break;
        }

        Priority priority1 = Priority.valueOf("HIGH");

        Priority[] values = Priority.values();
        for (Priority p:values){
            System.out.println("enum : " + p);
        }
    }
}
