package org.example.demolombok;

import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

public class demo {

    public static void main(String[] args) throws IOException {
        String asciibloup = FigletFont.convertOneLine("Hiter et Pol Pot vont dans un bar, ils croisent un juif innocent, ils le tabassent");
        TestLombok jean = new TestLombok();
        jean.setId(12);
        System.out.println(jean);
        System.out.println(asciibloup);

    }




}
