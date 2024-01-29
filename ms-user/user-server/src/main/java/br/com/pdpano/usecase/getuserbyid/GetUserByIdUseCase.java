package br.com.pdpano.usecase.getuserbyid;

import br.com.pdpano.commons.UseCase;
import br.com.pdpano.domain.User;

public interface GetUserByIdUseCase extends UseCase<Long, User> {
    @Override
    User execute(Long input);
}
