package exo2Stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Liste de commandes
        List<Commande> commandes = Arrays.asList(
                new Commande( "Alice", Arrays.asList("Ordinateur", "Souris"), 1200.50, true),
                new Commande( "Bob", Arrays.asList("Clavier", "Écran"), 300.75, false),
                new Commande( "Charlie", Arrays.asList("Imprimante"), 150.00, true),
                new Commande( "Alice", Arrays.asList("USB", "Casque"), 75.50, false),
                new Commande( "Bob", Arrays.asList("Tablette"), 200.00, true)
        );
//
//commandes.stream().forEach(System.out::println);
//
//commandes.stream().forEach(commande->System.out.println(commande.getClient()));
//
//        System.out.println(commandes.stream().collect(Collectors.summarizingDouble(Commande::getMontantTotal)).getSum());
//
//commandes.stream().forEach(commande -> System.out.println("Articles choisis : "+ commande.getArticles() + " Prix total : " + commande.getMontantTotal()));
//
//commandes.stream().filter(commande->commande.isEstLivree()==true).forEach(System.out::println);
//
//commandes.stream().collect(Collectors.groupingBy(Commande::getClient,Collectors.summingDouble(Commande::getMontantTotal))).forEach((client, prix)-> System.out.println(client +" : " + prix));
//
//        List<String> articlesUniques = new ArrayList<>();
//        commandes.stream().flatMap(comm -> comm.getArticles().stream())
//                .filter(article -> !articlesUniques.contains(article))
//                .forEach(article -> articlesUniques.add(article));
//        System.out.println(articlesUniques);
//
//        commandes.stream().allMatch(commande -> commande.getClient().,)
//
//        System.out.println(commandes.stream().collect(Collectors
//                .groupingBy(Commande::getClient)).values().stream()
//                .allMatch(list-> list.stream().anyMatch(commande -> commande.isEstLivree()==true)));
//
    }
}
