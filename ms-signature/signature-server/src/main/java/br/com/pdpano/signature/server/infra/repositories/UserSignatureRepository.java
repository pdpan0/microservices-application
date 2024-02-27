package br.com.pdpano.signature.server.infra.repositories;

import br.com.pdpano.signature.server.infra.entities.UserSignatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSignatureRepository extends JpaRepository<UserSignatureEntity, Long> {
}
