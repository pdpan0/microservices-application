package br.com.pdpano.signature.server.domain;

public enum SignatureCode {
    STARTER, PRO;

    public static SignatureCode findByCode(String code) {
        return SignatureCode.valueOf(code.toUpperCase());
    }
}