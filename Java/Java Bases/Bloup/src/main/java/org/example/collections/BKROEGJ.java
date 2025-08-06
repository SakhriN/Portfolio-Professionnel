package org.example.collections;
    import java.util.HashMap;
import java.util.Map;
public class BKROEGJ {
    abstract class Article {
        private String reference;
        private String nom;
        private double prixUnitaire;

        // Getters et setters pour accéder aux propriétés privées
        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public double getPrixUnitaire() {
            return prixUnitaire;
        }

        public void setPrixUnitaire(double prixUnitaire) {
            this.prixUnitaire = prixUnitaire;
        }
    }

    class ArticleUnitaire extends Article {
        // spécificités des articles unitaires (par exemple, couleur pour les stylos, grammage pour les ramettes)
    }

    class Ramette extends ArticleUnitaire {
        private int grammage;

        // Getters et setters spécifiques à Ramette
        public int getGrammage() {
            return grammage;
        }

        public void setGrammage(int grammage) {
            this.grammage = grammage;
        }
    }

    class Stylo extends ArticleUnitaire {
        private String couleur;

        // Getters et setters spécifiques à Stylo
        public String getCouleur() {
            return couleur;
        }

        public void setCouleur(String couleur) {
            this.couleur = couleur;
        }
    }

    class Lot {
        private Article article;
        private int quantite;
        private double pourcentageRemise;

        // Getters et setters spécifiques à Lot
        public Article getArticle() {
            return article;
        }

        public void setArticle(Article article) {
            this.article = article;
        }

        public int getQuantite() {
            return quantite;
        }

        public void setQuantite(int quantite) {
            this.quantite = quantite;
        }

        public double getPourcentageRemise() {
            return pourcentageRemise;
        }

        public void setPourcentageRemise(double pourcentageRemise) {
            this.pourcentageRemise = pourcentageRemise;
        }
    }

    class Facture {
        private static final int MAX_LIGNES = 10;

        private final Map<Article, Integer> lignesAchat;

        // Constructeur de Facture
        public Facture(String numeroFacture, String client, String date) {
            this.lignesAchat = new HashMap<>();
        }

        // Ajoute une ligne d'achat à la facture
        public void ajouterLigne(Article article, int quantite) {
            if (lignesAchat.size() < MAX_LIGNES) {
                lignesAchat.put(article, quantite);
            } else {
                System.out.println("Nombre maximum de lignes atteint.");
            }
        }

        public double getPrixTotal() {
            double prixTotal = 0;
            for (Map.Entry<Article, Integer> entry : lignesAchat.entrySet()) {
                Article article = entry.getKey();
                int quantite = entry.getValue();
                prixTotal += article.getPrixUnitaire() * quantite;
            }
            return prixTotal;
        }

        // Getters pour accéder aux propriétés privées
        public Map<Article, Integer> getLignesAchat() {
            return lignesAchat;
        }
    }

    class Ligne {
        private final Article article;
        private final int quantite;

        // Constructeur de Ligne
        public Ligne(Article article, int quantite) {
            this.article = article;
            this.quantite = quantite;
        }

        // Affiche les informations de la ligne
        public void afficheLigne() {
            System.out.println(
                    quantite + " - " + article.getReference() + " - " + article.getNom() +
                            " - " + article.getPrixUnitaire() + " - " + (article.getPrixUnitaire() * quantite)
            );
        }
    }

    public class PapeterieMain {
        public void main(String[] args) {
            // Exemple d'utilisation
            Ramette ramette = new Ramette();
            ramette.setReference("R001");
            ramette.setNom("Ramette A4");
            ramette.setPrixUnitaire(5.0);
            ramette.setGrammage(80);

            Stylo stylo = new Stylo();
            stylo.setReference("S001");
            stylo.setNom("Stylo à bille");
            stylo.setPrixUnitaire(2.0);
            stylo.setCouleur("Bleu");

            Lot lot = new Lot();
            lot.setArticle(ramette);
            lot.setQuantite(3);
            lot.setPourcentageRemise(10.0);

            Facture facture = new Facture("F001", "Client123", "2023-11-29");
            facture.ajouterLigne(ramette, 2);
            facture.ajouterLigne(stylo, 5);

            for (Map.Entry<Article, Integer> entry : facture.getLignesAchat().entrySet()) {
                Article article = entry.getKey();
                int quantite = entry.getValue();
                Ligne ligne = new Ligne(article, quantite);
                ligne.afficheLigne();
            }

            System.out.println("Prix total de la facture : " + facture.getPrixTotal());
        }
    }

}
