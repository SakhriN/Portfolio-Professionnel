package org.example.poo.bibliotheque;

public class LivreNumerique extends Livre {

    String format;
    double Octet;

    public LivreNumerique() {
    }

    public LivreNumerique(String title, String author, String format, double octet) {
        super(title, author);
        this.format = format;
        Octet = octet;
    }

    @Override
    public String toString() {
        return "LivreNumerique{" +
                "format='" + format + '\'' +
                ", Octet=" + Octet +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
