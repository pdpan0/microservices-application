package br.com.pdpano.domain;

public interface UserGateway {
    Long createUser(User user);
    User getUserById(Long userId);
}
