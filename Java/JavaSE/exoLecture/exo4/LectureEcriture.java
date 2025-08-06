package exo4;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class LectureEcriture {

    public void LireBestiaire(List<Demon> demons) {
        try (BufferedReader br = new BufferedReader(new FileReader("exo4/bestiaire.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                demons.add(new Demon(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), split[3]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void LireBonEvent(List<Evenement> bonevent) {
        try (BufferedReader br = new BufferedReader(new FileReader("exo4/bonevent.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                bonevent.add(new Evenement(split[0], split[1], Integer.parseInt(split[2]), split[3], split[4]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void LireMauvaisEvent(List<Evenement> mauvaisevent) {
        try (BufferedReader br = new BufferedReader(new FileReader("exo4/mauvaisevent.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                mauvaisevent.add(new Evenement(split[0], split[1], Integer.parseInt(split[2]), split[3], split[4]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void LirePersonnage(List<Personnage> personnages) {
        try {
            File file = new File("exo4/personnages.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("exo4/personnages.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
                personnages.add(new Personnage(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void EcrirePersonnage(Personnage personnage) {
        try (BufferedWriter bf = new BufferedWriter(new FileWriter("exo4/personnages.txt", true))) {
            bf.write(personnage.toString());
            bf.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int verification(Scanner scanner, int montant){
        while (montant < 1|| montant > 100) {
            System.out.println("Merci de donner une valeur entre 1 et 100");
            montant = scanner.nextInt();
            scanner.nextLine();
        }
        return montant;
    }

    public void EcritureAventure(String phrase){
        try (BufferedWriter bf = new BufferedWriter(new FileWriter("exo4/Aventure.txt",true))) {
            bf.write(phrase);
            bf.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
