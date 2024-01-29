package br.com.pdpano.domain._exceptions;

public class BadRequestException extends RuntimeException {
    private final String research;

    public BadRequestException(String research) {
        super("Occurs an error in" + research);

        this.research = research;
    }
}
