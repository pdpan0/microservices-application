package br.com.pdpano.usecase.createuser;

import br.com.pdpano.domain.User;
import br.com.pdpano.domain.UserGateway;
import br.com.pdpano.domain._exceptions.BadRequestException;
import br.com.pdpano.usecase.createuser.CreateUserInput;
import br.com.pdpano.usecase.createuser.CreateUserUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private final UserGateway gateway;

    public CreateUserUseCaseImpl(UserGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public Long execute(CreateUserInput input) {
        if (input == null) {
            throw new BadRequestException("CreateUserUseCaseImpl");
        }

        final Long userCreated = gateway.createUser(new User(null, input.name(), input.username(), input.password()));

        return userCreated;
    }

}
