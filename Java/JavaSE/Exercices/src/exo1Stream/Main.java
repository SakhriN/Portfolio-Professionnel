package exoStream;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String sCurrentLine;
        List<Film> films = new ArrayList<>();
        System.out.println("Répertoire actuel : " + System.getProperty("user.dir"));
        String file = "src/exoStream/films.csv";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            while ((sCurrentLine = br.readLine()) != null) {
                String ligne[] = sCurrentLine.split(",");
                films.add(new Film(ligne[0], LocalDate.parse(ligne[1]), ligne[2], ligne[3], Integer.parseInt(ligne[4])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//1.Lecture et affichage basique avec Streams

//        films.stream().limit(10).forEach(film -> System.out.println(film));

//        films.stream().forEach(film -> System.out.println(film.getTitre()));

//2.Filtrage avec Streams

//films.stream().filter(film -> film.getGenre().equals("Action")).forEach(film -> {
//    System.out.println("titre : "+film.getTitre()+", date de sortie : "+film.getDateSortie());
//});

//        films.stream().filter(film -> film.getDateSortie().isAfter(LocalDate.parse("2000-01-01"))).forEach(film -> {
//            System.out.println("Titre : "+film.getTitre());
//        });

//        films.stream().filter(film -> film.getRealisateur().equals("Michael Webster")).forEach(film -> System.out.println(film));

//3.Tri et limitation avec Streams

//films.stream().sorted(Comparator.comparing(film -> film.getEntreeNombre())).limit(5).forEach(film -> System.out.println("Film : \n "+ film));

//        films.stream().sorted(Comparator.comparing(film -> film.getDateSortie())).forEach(film -> System.out.println("Titre : "+ film.getTitre()));

//        films.stream().sorted(Comparator.comparing(film -> film.getEntreeNombre())).limit(10).forEach(film -> System.out.println("Film : \n "+ film));

//4.Regroupement avec Streams

//        films.stream().collect(Collectors.groupingBy(Film::getGenre,Collectors.counting())).forEach((genre,count) -> System.out.println(genre+" : "+count));

//        films.stream().collect(Collectors.groupingBy(Film::getRealisateur)).forEach((realisateur,count) -> System.out.println(realisateur+" : \n "+count));

//5.Calcul avec Streams

//        System.out.println("Nombre de places vendues par tous les films : "+ films.stream().mapToLong(Film::getEntreeNombre).sum());

//     films.stream().collect(Collectors.groupingBy(Film::getGenre, Collectors.summingLong(Film::getEntreeNombre)))
//             .entrySet().stream().max(Map.Entry.comparingByValue())
//             .ifPresent(entry->
//                     System.out.println("Genre qui vend le plus : "+ entry.getKey()+"\n Nombres de Places : " +entry.getValue()));


//        System.out.println("Nombre de places vendues du réalisateur Bobby Coleman : " + films.stream().collect(Collectors.groupingBy(Film::getRealisateur, Collectors.averagingDouble(Film::getEntreeNombre))).get("Bobby Coleman"));


//6. Transformation avec Streams

//        films.stream().forEach(film -> System.out.println(film.getTitre()+" ("+film.getGenre()+") - Réalisé par "+film.getRealisateur()+" en "+film.getDateSortie()));

//        films.stream().map(Film::getGenre).distinct().sorted().forEach(genre -> System.out.println(genre));

//7. Questions avancées

//        films.stream().collect(Collectors.groupingBy(Film::getGenre, Collectors.minBy(Comparator.comparing(Film::getDateSortie))))
//                .forEach((s, filmOptional) -> filmOptional.ifPresent((film)-> System.out.println("Film: " + s + " - " + film)));

//films.stream().collect(Collectors.groupingBy(Film::getRealisateur, Collectors.counting())).entrySet()
//        .stream()
//        .filter(entry -> entry.getValue() > 50)
//        .forEach(entry -> System.out.println("Réalisateur : " + entry.getKey() + " - Nombre de films : " + entry.getValue()));

//        System.out.println("Nombre de places vendues entre 1990 et 2000 : " + films.stream().filter(film -> film.getDateSortie().isBefore(LocalDate.parse("2000-12-31"))
//                && film.getDateSortie().isAfter(LocalDate.parse("1990-01-01")))
//                .mapToLong(Film::getEntreeNombre).sum());

    }
}
