package br.com.pdpano.infra.repositories;

import br.com.pdpano.infra.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {}
