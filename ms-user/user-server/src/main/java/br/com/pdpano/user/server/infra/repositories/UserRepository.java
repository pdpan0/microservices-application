package br.com.pdpano.user.server.infra.repositories;

import br.com.pdpano.user.server.infra.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {}
