package br.com.pdpano.signature.server.infra.gateways;

import br.com.pdpano.signature.server.domain.UserSignature;
import br.com.pdpano.signature.server.domain.UserSignatureGateway;
import br.com.pdpano.signature.server.domain.UserSignatureStatus;
import br.com.pdpano.signature.server.infra.entities.UserSignatureEntity;
import br.com.pdpano.signature.server.infra.repositories.UserSignatureRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserSignatureDatabaseGateway implements UserSignatureGateway {
    private final UserSignatureRepository userSignatureRepository;

    public UserSignatureDatabaseGateway(UserSignatureRepository userSignatureRepository) {
        this.userSignatureRepository = userSignatureRepository;
    }

    @Override
    public Long createUserSignature(UserSignature userSignature) {
        return userSignatureRepository.save(UserSignatureEntity.toEntity(userSignature)).id;
    }

    @Override
    public void commitUserSignature(Long userSignatureId) {
        userSignatureRepository.findById(userSignatureId)
                .map(userSignatureEntity -> userSignatureRepository.save(
                        new UserSignatureEntity(
                                userSignatureEntity.id,
                                userSignatureEntity.userId,
                                userSignatureEntity.signatureId,
                                UserSignatureStatus.PROCESSED,
                                userSignatureEntity.createdAt,
                                userSignatureEntity.isActive
                        )));
    }
}
