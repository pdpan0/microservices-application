package br.com.pdpano.signature.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SignatureApplication {
    public static void main(String[] args) {
        SpringApplication.run(SignatureApplication.class, args);
    }

}
