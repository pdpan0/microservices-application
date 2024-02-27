package br.com.pdpano.signature.server.usecase.io;

import java.util.UUID;

public record CreateUserSignatureInput(
        UUID userUuid,
        Long signatureId
) {}