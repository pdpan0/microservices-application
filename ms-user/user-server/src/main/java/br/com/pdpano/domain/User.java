package br.com.pdpano.domain;

public record User(
        Long id,
        String name,
        Credentials credentials
) {}