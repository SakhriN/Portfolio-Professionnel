public class AdvancedProcessDemo {

    public static void main(String[] args) {

        AdvancedProcess processeur = input -> input.trim().toUpperCase();

        System.out.println("Résultat : "+processeur.process("Bonjour, tout le monde"));

        processeur.print("Bonjour, tout le monde");
        AdvancedProcess.information();
    }
}
