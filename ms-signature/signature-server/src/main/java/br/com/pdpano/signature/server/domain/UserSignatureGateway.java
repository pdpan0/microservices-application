package br.com.pdpano.signature.server.domain;

public interface UserSignatureGateway {
    Long createUserSignature(UserSignature userSignature);
    void commitUserSignature(Long userSignatureId);
}
