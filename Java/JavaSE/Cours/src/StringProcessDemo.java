public class StringProcessDemo {

    public static void main(String[] args) {

        StringProcess toUpperCaseProcess = string -> string.toUpperCase();

        System.out.println("Majuscules : " + toUpperCaseProcess.process("brouhaha"));

        StringProcess reverseProcess = input -> new StringBuilder(input).reverse().toString();
        System.out.println("On va retourner ta mere : " + reverseProcess.process("Mère"));


    }


}
