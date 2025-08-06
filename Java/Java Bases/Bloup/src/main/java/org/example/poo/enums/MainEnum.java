package org.example.poo.enums;

import java.util.Scanner;

public class MainEnum {
    public static void main(String[] args) {
        Scanner infrarouge = new Scanner(System.in);
        System.out.println("Bonjour, veuillez ecrire une lettre parmi les suivantes : A, B, C, D. Si vous ne faites pas ce qu'on vous dit, je vous tabasse.");
        String test = infrarouge.nextLine();
        int energie = 110;

        while (energie > 0 && (!test.equals("A") && !test.equals("B") && !test.equals("C") && !test.equals("D"))){
            energie = energie - 10;
            System.out.printf("Nassim vous met une droite, il vous reste %d points de vie\n", energie);

            if (energie > 0) {
                System.out.println("Casse pas la tête, donne une lettre entre A, B, C et D");
                test = infrarouge.nextLine();
            }
        }

        if (energie == 0) {
            System.out.println("Tu es mort, revient quand tu sera moins con.");
        } else {
            System.out.println(Enumerations.Priority.getPriority(test));
        }

    }
}
