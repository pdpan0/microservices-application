package br.com.pdpano.signature.server.usecase;

import br.com.pdpano.commons.UseCase;
import br.com.pdpano.signature.server.usecase.io.CreateUserSignatureInput;

public interface CreateUserSignatureUseCase extends UseCase<CreateUserSignatureInput, Long> {
    @Override
    Long execute(CreateUserSignatureInput input);
}
