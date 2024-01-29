package br.com.pdpano.domain;

public interface PasswordEncryptor {
    String encryptPassword(String password);
    boolean checkPassword(String password, String hashedPassword);
}
