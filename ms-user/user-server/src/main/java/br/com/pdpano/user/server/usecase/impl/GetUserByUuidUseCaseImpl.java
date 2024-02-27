package br.com.pdpano.user.server.usecase.impl;

import br.com.pdpano.user.server.domain.User;
import br.com.pdpano.user.server.domain.UserGateway;
import br.com.pdpano.user.server.usecase.GetUserByUuidUseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GetUserByUuidUseCaseImpl implements GetUserByUuidUseCase {

    private final UserGateway gateway;

    public GetUserByUuidUseCaseImpl(UserGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public User execute(UUID input) {
        return gateway.getUserByUuid(input);
    }
}
