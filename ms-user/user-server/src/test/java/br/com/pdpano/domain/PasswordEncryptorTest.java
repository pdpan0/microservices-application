package br.com.pdpano.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PasswordEncryptorTest {

    @Autowired
    private PasswordEncryptor encryptor;

    @Test
    public void testPasswordEncryption() {
        final String password = "teste123";
        final String invalidPassword = "outroteste123";
        final String hashedPassword = encryptor.encryptPassword(password);

        assertTrue(
                encryptor.checkPassword(password, hashedPassword),
                "Password " + password + " encrypted is not valid");
        assertFalse(
                encryptor.checkPassword(invalidPassword, hashedPassword),
                "Password "+ invalidPassword + " encrypted is valid");
    }

}