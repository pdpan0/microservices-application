package br.com.pdpano.user.server.domain;

import java.util.UUID;

public interface UserGateway {
    UUID createUser(User user);
    User getUserByUuid(UUID uuid);
}
