package br.com.pdpano.signature.server.infra.entities;

import br.com.pdpano.signature.server.domain.Signature;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_signatures")
public class SignatureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public SignatureEntity(Long id) {
        this.id = id;
    }

    public SignatureEntity() {}

    public static SignatureEntity toEntity(Signature entity) {
        return new SignatureEntity(null);
    }

}
