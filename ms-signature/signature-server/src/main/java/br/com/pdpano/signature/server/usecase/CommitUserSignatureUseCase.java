package br.com.pdpano.signature.server.usecase;

import br.com.pdpano.commons.UseCase;

public interface CommitUserSignatureUseCase extends UseCase<Long, Void> {
    @Override
    Void execute(Long input);
}
