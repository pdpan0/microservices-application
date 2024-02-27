package br.com.pdpano.user.server.usecase;

import br.com.pdpano.commons.UseCase;
import br.com.pdpano.user.server.usecase.io.CreateUserInput;

import java.util.UUID;

public interface CreateUserUseCase extends UseCase<CreateUserInput, UUID> {
    @Override
    UUID execute(CreateUserInput input);
}
