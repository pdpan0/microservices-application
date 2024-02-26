package br.com.pdpano.signature.server.domain;

public enum Renovation {
    MONTHLY, YEARLY;

    public static Renovation findByCode(String code) {
        return Renovation.valueOf(code.toUpperCase());
    }
}
