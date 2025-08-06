package org.example.collections.papeterie;

public class Ramette extends ArticleUnitaire {
    int grammage;
    public Ramette(String nom, float prix, int grammage) {
        super(nom, prix);
        this.grammage = grammage;
    }

    @Override
    public String toString() {
        return "Ramette{" +
                "grammage=" + grammage +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", id=" + id +
                '}';
    }
}
