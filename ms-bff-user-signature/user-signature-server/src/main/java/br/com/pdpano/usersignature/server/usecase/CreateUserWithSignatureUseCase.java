package br.com.pdpano.usersignature.server.usecase;

import br.com.pdpano.commons.UseCase;

public interface CreateUserWithSignatureUseCase extends UseCase<Void, Void> {
    @Override
    Void execute(Void input);
}
