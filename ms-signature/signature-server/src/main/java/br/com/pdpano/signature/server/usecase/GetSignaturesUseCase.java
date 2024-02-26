package br.com.pdpano.signature.server.usecase;

import br.com.pdpano.commons.UseCase;
import br.com.pdpano.signature.server.domain.Signature;

import java.util.List;

public interface GetSignaturesUseCase extends UseCase<Void, List<Signature>> {
    @Override
    List<Signature> execute(Void input);
}
