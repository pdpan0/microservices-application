package br.com.pdpano.user.server.usecase.createuser;

public record CreateUserInput(
        String name,
        String username,
        String password,
        String confirmationPassword
) {}