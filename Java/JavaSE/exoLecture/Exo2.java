import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Exo2 {


    public static void main(String[] args) {
        int choix = 12;
        String liste = "activite.txt";
        String depart = "fichierexo2.txt";
        String arrivee = "fin.dat";
        List<String> listeActivites = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String activite = "rien";

        try (BufferedReader reader = new BufferedReader(new FileReader(liste))) {
            String line;
            while ((line = reader.readLine()) != null) {
                listeActivites.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        while (choix != 0) {
            System.out.println("Veuillez entrer votre choix : \n" +
                    "1. Ajouter une activité \n" +
                    "2. Afficher les activités\n" +
                    "3. Sauvegarder en binaire\n" +
                    "4. Lire le fichier binaire\n" +
                    "0. Quitter \n" +
                    "Choisissez une option : ");
            choix = sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1 -> {
                    System.out.println("Merci de choisir l'activité a ajouter : ");
                    int nombre = 1;
                    for (String act : listeActivites) {
                        System.out.println(nombre+". "+act);
                        nombre++;
                    }
                    choix = sc.nextInt();
                    sc.nextLine();
                    if (choix-1 >= listeActivites.size() || choix < 0) {
                        System.out.println("Annulation du choix. Retour au menu principal...");
                    } else {
                        LocalDateTime localDateTime = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                        String dateLocale = formatter.format(localDateTime);

                        activite = dateLocale + " : " + listeActivites.get(choix-1);
                        File file = new File(depart);
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            if (file.length() != 0) {
                                writer.newLine();
                            }
                            writer.write(activite);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        choix = 1;
                    }
                }
                case 2 -> {
                    System.out.println("Les activités gardées sont : ");
                    try (BufferedReader reader = new BufferedReader(new FileReader(depart))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case 3 -> {
                    System.out.println("En cours de création...");
                    try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(depart));
                         BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(arrivee))) {
                        File file = new File(arrivee);
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        byte[] buffer = new byte[1024];
                        int bytesRead;
                        while ((bytesRead = in.read(buffer)) != -1) {
                            out.write(buffer, 0, bytesRead);
                        }
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    }
                    System.out.println("Fin de la transformation en binaire.");
                }
                case 4 -> {
                    System.out.println("En cours de lecture...");
                    try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(arrivee))) {
                        byte[] bytes = bis.readAllBytes();
                        String texteultime = new String(bytes, StandardCharsets.UTF_8);
                        System.out.println(texteultime);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                case 0 -> {
                    System.out.println("Bonne journée.");
                }
                default -> System.out.println("Invalide...");
            }


        }
    }
}
