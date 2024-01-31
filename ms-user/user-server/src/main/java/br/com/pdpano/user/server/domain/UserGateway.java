package br.com.pdpano.user.server.domain;

public interface UserGateway {
    Long createUser(User user);
    User getUserById(Long userId);
}
