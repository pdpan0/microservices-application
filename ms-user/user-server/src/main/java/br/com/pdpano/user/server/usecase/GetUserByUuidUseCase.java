package br.com.pdpano.user.server.usecase;

import br.com.pdpano.commons.UseCase;
import br.com.pdpano.user.server.domain.User;

import java.util.UUID;

public interface GetUserByUuidUseCase extends UseCase<UUID, User> {
    @Override
    User execute(UUID input);
}
