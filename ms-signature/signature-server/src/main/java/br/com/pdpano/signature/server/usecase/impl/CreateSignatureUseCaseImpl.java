package br.com.pdpano.signature.server.usecase.impl;

import br.com.pdpano.signature.server.domain.Renovation;
import br.com.pdpano.signature.server.domain.Signature;
import br.com.pdpano.signature.server.domain.SignatureCode;
import br.com.pdpano.signature.server.domain.SignatureGateway;
import br.com.pdpano.signature.server.usecase.CreateSignatureUseCase;
import br.com.pdpano.signature.server.usecase.io.CreateSignatureInput;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CreateSignatureUseCaseImpl implements CreateSignatureUseCase {

    private final SignatureGateway signatureGateway;

    public CreateSignatureUseCaseImpl(SignatureGateway signatureGateway) {
        this.signatureGateway = signatureGateway;
    }

    @Override
    public Long execute(CreateSignatureInput input) {
        return signatureGateway.createSignature(
                new Signature(
                        null,
                        SignatureCode.findByCode(input.code()),
                        Renovation.findByCode(input.renovation()),
                        input.price(),
                        true,
                        LocalDateTime.now()
                )
        );
    }

}
