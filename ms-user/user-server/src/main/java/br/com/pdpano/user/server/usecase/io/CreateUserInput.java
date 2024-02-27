package br.com.pdpano.user.server.usecase.io;

public record CreateUserInput(
        String name,
        String username,
        String password,
        String confirmationPassword
) {}