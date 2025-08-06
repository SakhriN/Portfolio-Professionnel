import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 1) // Crée un flux infini à partir de 0 et incrémente de 1
                .parallel()             // Active le traitement parallèle
                .forEach(i -> {
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                });
    }
}