package br.com.pdpano.usecase.createuser;

import br.com.pdpano.commons.UseCase;

public interface CreateUserUseCase extends UseCase<CreateUserInput, Long> {
    @Override
    Long execute(CreateUserInput input);
}
