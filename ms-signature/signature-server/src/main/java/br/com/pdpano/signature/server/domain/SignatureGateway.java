package br.com.pdpano.signature.server.domain;

public interface SignatureGateway {
    Long createSignature(Signature signature);
}
