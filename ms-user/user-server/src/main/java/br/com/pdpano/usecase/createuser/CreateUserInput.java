package br.com.pdpano.usecase.createuser;

public record CreateUserInput(
        String name,
        String username,
        String password
) {}