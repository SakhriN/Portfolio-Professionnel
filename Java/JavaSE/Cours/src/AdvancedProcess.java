@FunctionalInterface
public interface AdvancedProcess {
    String process (String input);

    default void print(String input) {
        System.out.println("Process: " + input);
    }

    static void information(){
        System.out.println("Interface fonctionnelle personalisée pour le traitement de string......");
    }

}
