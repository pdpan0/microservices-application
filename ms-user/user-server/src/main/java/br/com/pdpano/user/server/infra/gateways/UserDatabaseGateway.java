package br.com.pdpano.user.server.infra.gateways;

import br.com.pdpano.user.server.domain.User;
import br.com.pdpano.user.server.domain.UserGateway;
import br.com.pdpano.user.server.infra.entities.UserEntity;
import br.com.pdpano.user.server.infra.repositories.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public class UserDatabaseGateway implements UserGateway {

    private final UserRepository repository;

    public UserDatabaseGateway(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID createUser(User user) {
        return repository.save(UserEntity.toEntity(user)).uuid;
    }

    @Override
    public User getUserByUuid(UUID uuid) {
        return repository.findById(uuid)
                .map(UserEntity::toDomain)
                .orElse(null);
    }
}
