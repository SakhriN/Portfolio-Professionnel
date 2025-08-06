package exoException.exo1AvecExceptionPerso;

public class Exo1Exception extends NumberFormatException {


    public Exo1Exception(String message, Throwable cause) {
        super(message);
        initCause(cause);
    }
}
