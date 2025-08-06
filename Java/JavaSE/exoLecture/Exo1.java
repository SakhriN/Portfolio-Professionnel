import java.io.*;

public class Exo1 {

    public static void main(String[] args) {
        int count = 0;
int depression = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("fichiertexte1.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                if (line.contains("Java")){
                    if(line.contains("Javascript")){
depression++;
                    }else{
                        count++;
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Nombre de Java lu dans le fichiertexte1.txt : " + count);

        File file = new File("fichiertextecompteur.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write("Nombre de ligne(s) qui inclus(ent) le mot Java dans fichiertexte1.txt : " + count+"\n");
            if(depression>0){
                writer.write("Nombre de fois ou tu a ecrit Javascript : " + depression + ". Bien joué fdp !!!!\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }




    }



}
