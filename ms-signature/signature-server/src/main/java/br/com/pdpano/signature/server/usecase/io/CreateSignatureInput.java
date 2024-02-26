package br.com.pdpano.signature.server.usecase.io;

import br.com.pdpano.signature.server.domain.RenovationType;
import br.com.pdpano.signature.server.domain.SignatureCode;

import java.math.BigDecimal;

public record CreateSignatureInput(
        String code,
        String renovationType,
        BigDecimal price
) {}
