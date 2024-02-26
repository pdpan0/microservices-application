package br.com.pdpano.signature.server.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Signature(
        Long id,
        SignatureCode code,
        RenovationType renovationType,
        BigDecimal price,
        boolean isActive,
        LocalDateTime createdAt
) {}
