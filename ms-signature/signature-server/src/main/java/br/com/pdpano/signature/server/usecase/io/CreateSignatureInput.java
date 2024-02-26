package br.com.pdpano.signature.server.usecase.io;

import java.math.BigDecimal;

public record CreateSignatureInput(
        String code,
        String renovation,
        BigDecimal price
) {}
