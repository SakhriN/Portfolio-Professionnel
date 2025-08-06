package org.example.collections.papeterie;

public class Article {


    int id;
    static int counter;

    public int getId() {
        return id;
    }



    {
        counter++;
    }

    public Article() {
        this.id = counter;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                '}';
    }
}
