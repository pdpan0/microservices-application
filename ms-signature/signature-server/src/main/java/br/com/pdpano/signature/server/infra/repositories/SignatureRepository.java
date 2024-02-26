package br.com.pdpano.signature.server.infra.repositories;

import br.com.pdpano.signature.server.infra.entities.SignatureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignatureRepository extends JpaRepository<SignatureEntity, Long> {}
