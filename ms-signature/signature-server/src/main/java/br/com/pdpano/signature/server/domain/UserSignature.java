package br.com.pdpano.signature.server.domain;

import java.time.LocalDateTime;

public record UserSignature(
        Long userSignatureId,
        Long userId,
        Long signatureId,
        UserSignatureStatus status,
        LocalDateTime createdAt,
        boolean isActive
) {}
