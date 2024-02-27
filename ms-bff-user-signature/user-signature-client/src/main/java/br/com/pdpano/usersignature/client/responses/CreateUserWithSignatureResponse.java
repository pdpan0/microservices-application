package br.com.pdpano.usersignature.client.responses;

import java.util.UUID;

public record CreateUserWithSignatureResponse(
        Long signatureId,
        UUID userUuid
) {}
