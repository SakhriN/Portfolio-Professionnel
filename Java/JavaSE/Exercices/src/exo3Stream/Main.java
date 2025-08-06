package exo3Stream;

import exoStream.Film;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String sCurrentLine;
        List<Books> bouquins = new ArrayList<>();
        System.out.println("Répertoire actuel : " + System.getProperty("user.dir"));
        String file = "src/exo3Stream/books_dataset.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            while ((sCurrentLine = br.readLine()) != null) {
                String ligne[] = sCurrentLine.split(",");
                bouquins.add(new Books(ligne[0],ligne[1],ligne[2], LocalDate.parse(ligne[3]), Integer.parseInt(ligne[4]), Boolean.valueOf(ligne[5]), Double.valueOf(ligne[6])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        bouquins.stream().filter(books -> books.isDisponible()).forEach(books -> {
//            System.out.println(books);
//        });

//        bouquins.stream().filter(books -> books.getDateDePublication().isBefore(LocalDate.of(1950,1,1))).forEach(books
//                -> System.out.println(" Titre : " + books.getTitre() + " de " + books.getAuteur()));

//        bouquins.stream().collect(Collectors.groupingBy(Books::getGenre)).forEach((genre, books) -> System.out.println(" Genre : " + genre + "\n" + books));

//        bouquins.stream().min(Comparator.comparing(Books::getDateDePublication)).ifPresent(System.out::println);

//        bouquins.stream().filter(books -> books.getTitre().startsWith("Harry")).forEach(books -> System.out.println(books.getTitre()));

//        System.out.println(" Prix Moyen des livres : " + bouquins.stream().filter(Books::isDisponible).collect(Collectors.averagingDouble(Books::getPrix)));


//        bouquins.stream().sorted(Comparator.comparing(Books::getNombreDePages)).sorted(Comparator.comparing(Books::getPrix)).forEach(System.out::println);

//        bouquins.stream().sorted(Comparator.comparingInt(Books::getNombreDePages).thenComparingDouble(Books::getPrix)).forEach(System.out::println);

//        System.out.println((Integer) bouquins.stream().filter(books -> books.getGenre().equals("Fantasy")).mapToInt(Books::getNombreDePages).sum());

//        bouquins.stream().filter(Books::isDisponible).max(Comparator.comparingDouble(Books::getPrix)).ifPresent(System.out::println);

//        bouquins.stream().collect(Collectors.groupingBy(Books::getAuteur, Collectors.counting())).entrySet().stream()
//                .filter(livre-> livre.getValue()>17).forEach(livre->{
//            System.out.println("Le meilleur auteur a son actif est : "+livre.getKey()+", avec " + livre.getValue() + " livres.");
//        });

//        bouquins.stream().collect(Collectors.groupingBy(Books::getGenre, Collectors.counting())).forEach((genre, count) -> {
//            System.out.println("Nombre de liste dans le genre "+genre+" : "+count+" pages.\n");
//        });

//        bouquins.stream().filter(books -> books.getPrix() < 10 && books.isDisponible()).forEach(books -> System.out.println(books));

//        bouquins.stream().collect(Collectors.groupingBy(books -> books.getDateDePublication().getYear(), Collectors.summingLong(Books::getNombreDePages))).forEach((year, books)-> System.out.println(year+" : \n" + books +" pages."));

    }
}
