package br.com.pdpano.user.server.usecase.getuserbyid;

import br.com.pdpano.commons.UseCase;
import br.com.pdpano.user.server.domain.User;

public interface GetUserByIdUseCase extends UseCase<Long, User> {
    @Override
    User execute(Long input);
}
