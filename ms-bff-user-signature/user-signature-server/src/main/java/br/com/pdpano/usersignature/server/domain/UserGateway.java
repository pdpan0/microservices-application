package br.com.pdpano.usersignature.server.domain;

import br.com.pdpano.user.client.requests.CreateUserRequest;

public interface UserGateway {

    Long createUser(CreateUserRequest user);

}
