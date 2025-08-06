package org.example;


import org.example.array.ArrayMatrix;
import org.example.operateur2.Operateur2;
import org.example.poo.Product;
import org.example.string.ChaineCaracteres;
import org.example.variables.Variable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        Variable.getVariable();
//        Operateur2.boucleFor();
//        ChaineCaracteres.getFormatString();
//        ArrayMatrix.getMatrix();
        Product p = new Product();
        p.setId(121);
        p.setName("Windows Phone");
        System.out.println(p);
        Product p2 = new Product("Table",12);
        System.out.println(p2);
        System.out.println(p2.getName());
        p2.setId(15);
        System.out.println(p2);
        p2.quiSuisJe();
        Product.getBonjour();

        }
    }
