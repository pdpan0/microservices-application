package br.com.pdpano.signature.server.usecase.impl;

import br.com.pdpano.signature.server.domain.Signature;
import br.com.pdpano.signature.server.domain.SignatureGateway;
import br.com.pdpano.signature.server.usecase.GetSignaturesUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetSignaturesUseCaseImpl implements GetSignaturesUseCase {
    private final SignatureGateway gateway;

    public GetSignaturesUseCaseImpl(SignatureGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<Signature> execute(Void input) {
        return gateway.getSignatures();
    }
}
