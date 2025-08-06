package dbz.superexempledelespace.demo.controller;

import dbz.superexempledelespace.demo.annotation.AfterAnnotation;
import dbz.superexempledelespace.demo.annotation.BeforeAnnotation;
import dbz.superexempledelespace.demo.annotation.ExecptionAnnotation;
import dbz.superexempledelespace.demo.entity.Book;
import dbz.superexempledelespace.demo.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class LibraryController {

    @Autowired
    private LibraryService service;

    @GetMapping("books")
    public List<Book> getbooks(){
        List<Book> books = service.getBooks();
        if(books.isEmpty()){
            service.methodThrow(412,"Grosse erreur !!!");
        }
        return service.getBooks();
    }

    @PostMapping("books")
    public Book postbooks(@RequestBody Book livre){
        return service.makeBook(
                livre.getTitre(),
                livre.getDatePublication(),
                livre.getAuteur(),
                livre.getCategorie(),
                livre.getPrix(),
                livre.estPrixNobel());
    }

    @DeleteMapping("books")
    public void deleteBook(@RequestParam String titre){
        List<Book> books = service.getBooks();
        if(books.isEmpty()){
            service.methodThrow(412,"Grosse erreur !!!");
        }
        service.deleteBook(titre);
    }
}
