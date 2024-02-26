package br.com.pdpano.signature.server.domain;

public enum RenovationType {
    MONTHLY, YEARLY;

    public static RenovationType findByCode(String code) {
        return RenovationType.valueOf(code.toUpperCase());
    }
}
