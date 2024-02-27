package br.com.pdpano.signature.server.usecase.impl;

import br.com.pdpano.signature.server.usecase.CommitUserSignatureUseCase;
import org.springframework.stereotype.Service;

@Service
public class CommitUserSignatureUseCaseImpl implements CommitUserSignatureUseCase {
    @Override
    public Void execute(Long input) {
        return null;
    }
}
