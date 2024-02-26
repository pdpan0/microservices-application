package br.com.pdpano.signature.server.infra.entities;

import br.com.pdpano.signature.server.domain.Renovation;
import br.com.pdpano.signature.server.domain.Signature;
import br.com.pdpano.signature.server.domain.SignatureCode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "tb_signatures")
public class SignatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public SignatureCode code;
    public Renovation renovation;
    public BigDecimal price;
    public boolean isActive;
    public LocalDateTime createdAt;

    public SignatureEntity(
            Long id,
            SignatureCode code,
            Renovation renovation,
            BigDecimal price,
            boolean isActive,
            LocalDateTime createdAt
    ) {
        this.id = id;
        this.code = code;
        this.renovation = renovation;
        this.price = price;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

    public SignatureEntity() {}

    public static SignatureEntity toEntity(Signature domain) {
        return new SignatureEntity(
                domain.id(),
                domain.code(),
                domain.renovation(),
                domain.price(),
                domain.isActive(),
                domain.createdAt()
        );
    }

    public static Signature toDomain(SignatureEntity entity) {
        return new Signature(
                entity.id,
                entity.code,
                entity.renovation,
                entity.price,
                entity.isActive,
                entity.createdAt
        );
    }

}
