package fr.groupe20.projet.exception;

public class UnknownCommandException extends Exception {
    @Override
    public String getMessage() {
        return "Unknown command";
    }
}
