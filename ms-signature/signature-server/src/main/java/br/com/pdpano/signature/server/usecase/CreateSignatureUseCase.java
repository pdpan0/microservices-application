package br.com.pdpano.signature.server.usecase;

import br.com.pdpano.commons.UseCase;
import br.com.pdpano.signature.server.usecase.io.CreateSignatureInput;

public interface CreateSignatureUseCase extends UseCase<CreateSignatureInput, Long> {
    @Override
    Long execute(CreateSignatureInput input);
}
