package org.example.collections.papeterie;

public class Stylo extends ArticleUnitaire {
String color;

    public Stylo(String nom, float prix, String color) {
        super(nom, prix);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "color='" + color + '\'' +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", id=" + id +
                '}';
    }
}
