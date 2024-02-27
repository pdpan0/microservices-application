package br.com.pdpano.signature.server.infra.entities;

import br.com.pdpano.signature.server.domain.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity(name = "tb_user_signatures")
public class UserSignatureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public Long userId;
    public Long signatureId;
    public UserSignatureStatus status;
    public LocalDateTime createdAt;
    public boolean isActive;

    public UserSignatureEntity() { }

    public UserSignatureEntity(Long id, Long userId, Long signatureId, UserSignatureStatus status, LocalDateTime createdAt, boolean isActive) {
        this.id = id;
        this.userId = userId;
        this.signatureId = signatureId;
        this.status = status;
        this.createdAt = createdAt;
        this.isActive = isActive;
    }

    public static UserSignatureEntity toEntity(UserSignature domain) {
            return new UserSignatureEntity(
                    domain.userSignatureId(),
                    domain.userId(),
                    domain.signatureId(),
                    domain.status(),
                    domain.createdAt(),
                    domain.isActive()
            );
        }

    public static UserSignature toDomain(UserSignatureEntity entity) {
        return new UserSignature(
                entity.id,
                entity.userId,
                entity.signatureId,
                entity.status,
                entity.createdAt,
                entity.isActive
        );
    }
}
