package br.com.pdpano.commons;

public interface UseCase<I, O> {
    O execute(I input);
}