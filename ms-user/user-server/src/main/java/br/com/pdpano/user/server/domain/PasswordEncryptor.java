package br.com.pdpano.user.server.domain;

public interface PasswordEncryptor {
    String encryptPassword(String password);
    boolean checkPassword(String password, String hashedPassword);
}
