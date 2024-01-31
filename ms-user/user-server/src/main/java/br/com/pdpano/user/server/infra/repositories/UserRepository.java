package br.com.pdpano.user.server.infra.repositories;

import br.com.pdpano.user.server.infra.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {}
