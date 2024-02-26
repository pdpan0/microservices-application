package br.com.pdpano.signature.server.infra.gateways;

import br.com.pdpano.signature.server.domain.Signature;
import br.com.pdpano.signature.server.domain.SignatureGateway;
import br.com.pdpano.signature.server.infra.entities.SignatureEntity;
import br.com.pdpano.signature.server.infra.repositories.SignatureRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SignatureDatabaseGateway implements SignatureGateway {
    private final SignatureRepository repository;

    public SignatureDatabaseGateway(SignatureRepository repository) {
        this.repository = repository;
    }

    @Override
    public Long createSignature(Signature signature) {
        return repository.save(SignatureEntity.toEntity(signature)).id;
    }
}
