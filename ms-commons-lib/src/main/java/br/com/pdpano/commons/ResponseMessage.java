package br.com.pdpano.commons;

public record ResponseMessage<T>(boolean success, T result) {

    public static <T> ResponseMessage<T> build(T result) {
        return new ResponseMessage<>(true, result);
    }

}