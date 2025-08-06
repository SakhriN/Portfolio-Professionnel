package dbz.superexempledelespace.demo.service;

import dbz.superexempledelespace.demo.annotation.AfterAnnotation;
import dbz.superexempledelespace.demo.annotation.AroundAnnotation;
import dbz.superexempledelespace.demo.annotation.BeforeAnnotation;
import dbz.superexempledelespace.demo.annotation.ExecptionAnnotation;
import dbz.superexempledelespace.demo.entity.Book;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    List<Book> bouquins = new ArrayList<>();



    @BeforeAnnotation
    @AroundAnnotation
    @AfterAnnotation
    public Book makeBook(String titre, LocalDate datePublication, String auteur, String categorie, double prix, boolean prixNobel){
        Book livre = new Book(titre,datePublication,auteur,categorie,prix,prixNobel);
        bouquins.add(livre);
        System.out.println(bouquins);
        return livre;
    }


    @BeforeAnnotation
    @AroundAnnotation
    @AfterAnnotation
    public void deleteBook(String titre){
        bouquins.removeIf(book -> book.getTitre().equals(titre));
    }

    @BeforeAnnotation
    @AroundAnnotation
    @AfterAnnotation
    public List<Book> getBooks(){
        return this.bouquins;
    }

    @ExecptionAnnotation
    public void methodThrow(int arg,String arg2){
        throw new IllegalArgumentException("execption de la superbe et incroyable méthode");
    }

}
