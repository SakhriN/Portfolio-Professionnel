import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Cours sort :");
        List<String> fruits = Arrays.asList("Pomme","Banane","Orange","Fraise");
//        fruits.sort((String f1, String f2) -> f1.compareTo(f2));
        fruits.sort(String::compareTo);
        System.out.println("Liste triée :"+ fruits + "\n");

        System.out.println("Cours Function :");
        Function<String,Integer> stringLengthFunction = str -> str.length();
//        Function<String,Integer> stringLengthFunction = String::length;

        String input = "Transformation";
        int length = stringLengthFunction.apply(input);

        System.out.println("Longueur du mot "+ input + " = " + length +"\n");

        System.out.println("Cours consumer :");
        Consumer<String> printMessage = message->{
            System.out.println("Message : " + message);
        };
        printMessage.accept("Ceci est une déclaration de guerre !!!\n");

        System.out.println("Cours Predicate :");
        Predicate<Integer> isEven = number -> number % 2 == 0;

        int testNumber = (int)(Math.round(Math.random()*100));
        if(isEven.test(testNumber)){
            printMessage.accept(testNumber+ " est pair.\n");
        } else {
            printMessage.accept(testNumber+ " est impaire, tu pue la défaite.\n");
        }



    }
}