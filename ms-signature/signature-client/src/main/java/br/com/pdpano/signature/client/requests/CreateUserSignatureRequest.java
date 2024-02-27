package br.com.pdpano.signature.client.requests;

import java.util.UUID;

public record CreateUserSignatureRequest(
        UUID userUuid,
        Long signatureId
) {}
