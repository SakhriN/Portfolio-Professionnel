package org.example.poo.tpbooks;

public class Author {
    int idAuthor;
    int counter;

    String firstname;
    String lastname;


    public Author() {

    }


    {
        counter++;
    }
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Author(String firstname, String lastname) {
        this.idAuthor = counter;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "idAuthor=" + idAuthor +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
