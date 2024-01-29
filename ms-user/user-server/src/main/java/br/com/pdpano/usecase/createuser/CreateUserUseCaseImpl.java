package br.com.pdpano.usecase.createuser;

import br.com.pdpano.domain.Credentials;
import br.com.pdpano.domain.PasswordEncryptor;
import br.com.pdpano.domain.User;
import br.com.pdpano.domain.UserGateway;
import br.com.pdpano.domain._exceptions.BadRequestException;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private final UserGateway gateway;
    private final PasswordEncryptor passwordEncryptor;

    public CreateUserUseCaseImpl(UserGateway gateway, PasswordEncryptor passwordEncryptor) {
        this.gateway = gateway;
        this.passwordEncryptor = passwordEncryptor;
    }

    @Override
    public Long execute(CreateUserInput input) {
        if (input == null) {
            throw new BadRequestException("CreateUserUseCaseImpl");
        }

        final Credentials credentials = new Credentials(
                input.username(),
                passwordEncryptor.encryptPassword(input.password()));

        return gateway.createUser(new User(null, input.name(), credentials));
    }

}
