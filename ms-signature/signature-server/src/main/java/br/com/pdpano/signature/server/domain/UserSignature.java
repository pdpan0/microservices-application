package br.com.pdpano.signature.server.domain;

import java.time.LocalDateTime;

public record UserSignature(
        Long userId,
        Long signatureId,
        LocalDateTime createdAt,
        boolean isActive
) {}
