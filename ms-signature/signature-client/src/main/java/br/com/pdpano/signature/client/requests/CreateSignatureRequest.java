package br.com.pdpano.signature.client.requests;

import java.math.BigDecimal;

public record CreateSignatureRequest(
        String code,
        String renovation,
        BigDecimal price
) {}