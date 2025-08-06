package org.example.exceptions;

public class SoldeInsuffisantException extends Exception {
    public SoldeInsuffisantException(String message){
        super(message);
        System.out.println("Tu est nul, abandonne la vie." + message);
    }

}
