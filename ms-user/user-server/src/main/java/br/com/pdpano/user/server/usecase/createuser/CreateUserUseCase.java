package br.com.pdpano.user.server.usecase.createuser;

import br.com.pdpano.commons.UseCase;

public interface CreateUserUseCase extends UseCase<CreateUserInput, Long> {
    @Override
    Long execute(CreateUserInput input);
}
