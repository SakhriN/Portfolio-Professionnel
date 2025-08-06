package org.example.poo.bibliotheque;

public class Livre {

    static int counter;
    int id;
    String title, author;

    public Livre(){

    }


    {
        counter++;
    }
    public Livre(String title, String author) {
        this.id = counter;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
