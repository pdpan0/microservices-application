package br.com.pdpano.domain;

public record User(
        Long id,
        String name,
        String username,
        String password
) {}