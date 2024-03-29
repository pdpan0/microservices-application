package br.com.pdpano.user.server.infra.utils;

import br.com.pdpano.user.server.domain.PasswordEncryptor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class BCryptPasswordEncryptor implements PasswordEncryptor {
    @Override
    public String encryptPassword(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }

    @Override
    public boolean checkPassword(String password, String hashedPassword) {
        return new BCryptPasswordEncoder().matches(password, hashedPassword);
    }
}
