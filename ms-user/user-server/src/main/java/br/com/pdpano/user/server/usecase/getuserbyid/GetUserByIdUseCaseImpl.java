package br.com.pdpano.user.server.usecase.getuserbyid;

import br.com.pdpano.user.server.domain.User;
import br.com.pdpano.user.server.domain.UserGateway;
import org.springframework.stereotype.Service;

@Service
public class GetUserByIdUseCaseImpl implements GetUserByIdUseCase {

    private final UserGateway gateway;

    public GetUserByIdUseCaseImpl(UserGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public User execute(Long input) {
        return gateway.getUserById(input);
    }
}
