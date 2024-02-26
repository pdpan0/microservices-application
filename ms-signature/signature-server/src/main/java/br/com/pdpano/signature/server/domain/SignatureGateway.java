package br.com.pdpano.signature.server.domain;

import java.util.List;

public interface SignatureGateway {
    Long createSignature(Signature signature);
    List<Signature> getSignatures();
}
