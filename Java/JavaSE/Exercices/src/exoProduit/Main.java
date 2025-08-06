package exoProduit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Produit> produits = new ArrayList<Produit>();
        List<Produit> produitstransform = new ArrayList<Produit>();
        produits.add(new Produit("Gel douche", 125, 12.99));
        produits.add(new Produit("Godemichet", 0, 125.99));
        produits.add(new Produit("Talc", 1000, 0.99));

        FiltreProduit filtreStock = produit -> produit.getQuantité() > 0;
        FiltreProduit filtreNom = produit -> produit.getNom().toLowerCase().contains("o");
        TransformationProduit modifierQuantitéProduit = (produit, numero) ->{produit.setQuantité(produit.getQuantité() + numero); return produit;};
        TransformationProduit modifierPrixProduit = (produit, numero) -> {
            if ((numero < -produit.getPrix())) {
                produit.setPrix(0);
            } else {
                produit.setPrix(produit.getPrix() + numero);
            }
            return produit;};



        for (Produit p : produits) {
            if (filtreStock.check(p)) {
                System.out.println(p);
            }
        }
        System.out.println("\n");



        for (Produit p : produits) {
            if (filtreNom.check(p)) {
                System.out.println(p);
            }
        }
        System.out.println("\n");



        for (Produit p : produits) {
            Produit transformé = modifierPrixProduit.transformation(p, 10);
            produitstransform.add(transformé);
        }
        for (Produit p : produitstransform) {
            System.out.println(p);
        }
        System.out.println("\n");
        produitstransform.clear();



        for (Produit p : produits) {
            Produit transformé = modifierPrixProduit.transformation(p, -10);
            produitstransform.add(transformé);
        }
        for (Produit p : produitstransform) {
            System.out.println(p);
        }
        System.out.println("\n");
        produitstransform.clear();



        for (Produit p : produits) {
            Produit transformé = modifierQuantitéProduit.transformation(p, 10);
            produitstransform.add(transformé);
        }
        for (Produit p : produitstransform) {
            System.out.println(p);
        }
        System.out.println("\n");
        produitstransform.clear();



        for (Produit p : produits) {
            Produit transformé = modifierQuantitéProduit.transformation(p, -10);
            produitstransform.add(transformé);
        }
        for (Produit p : produitstransform) {
            System.out.println(p);
        }

        System.out.println("\n");
        produitstransform.clear();


        OperationProduit produitSupérieur = (produit, transformationProduit, filtreProduit) ->
        {
            if (filtreStock.check(produit)) {
                modifierPrixProduit.transformation(produit, 10);
                System.out.println(produit);
            }
        };

    }
}