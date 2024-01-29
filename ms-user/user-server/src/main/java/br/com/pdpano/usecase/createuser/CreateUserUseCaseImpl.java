package br.com.pdpano.usecase.createuser;

import br.com.pdpano.domain.Credentials;
import br.com.pdpano.domain.PasswordEncryptor;
import br.com.pdpano.domain.User;
import br.com.pdpano.domain.UserGateway;
import br.com.pdpano.domain._exceptions.PasswordException;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private final UserGateway gateway;
    private final PasswordEncryptor encryptor;

    public CreateUserUseCaseImpl(UserGateway gateway, PasswordEncryptor encryptor) {
        this.gateway = gateway;
        this.encryptor = encryptor;
    }

    @Override
    public Long execute(@NotNull CreateUserInput input) {
        if (!Objects.equals(input.password(), input.confirmationPassword())) {
            throw new PasswordException("Password and confirmation password doesn't match");
        }

        final Credentials credentials = new Credentials(input.username(), encryptor.encryptPassword(input.password()));

        return gateway.createUser(new User(null, input.name(), credentials, true, LocalDateTime.now()));
    }

}
