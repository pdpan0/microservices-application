package br.com.pdpano.user.client.requests;

public record CreateUserRequest(
        String name,
        String username,
        String password,
        String confirmationPassword
) {}