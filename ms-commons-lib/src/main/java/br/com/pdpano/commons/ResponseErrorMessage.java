package br.com.pdpano.commons;

public record ResponseErrorMessage<T>(
        boolean success,
        String cause,
        String message,
        T object
) {
    public static ResponseErrorMessage<Void> build(Throwable throwable) {
        return new ResponseErrorMessage<>(false, throwable.getClass().getSimpleName(), throwable.getMessage(), null);
    }
}
