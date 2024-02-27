package br.com.pdpano.usersignature.client.requests;

import br.com.pdpano.user.client.requests.CreateUserRequest;

public record CreateUserWithSignatureRequest(
        Long signatureId,
        CreateUserRequest user
) {}
