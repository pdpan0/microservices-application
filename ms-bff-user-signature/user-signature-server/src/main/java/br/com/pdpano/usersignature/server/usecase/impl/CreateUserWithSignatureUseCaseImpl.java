package br.com.pdpano.usersignature.server.usecase.impl;

import br.com.pdpano.usersignature.client.requests.CreateUserWithSignatureRequest;
import br.com.pdpano.usersignature.client.responses.CreateUserWithSignatureResponse;
import br.com.pdpano.usersignature.server.infra.SignatureClient;
import br.com.pdpano.usersignature.server.infra.UserClient;
import br.com.pdpano.usersignature.server.usecase.CreateUserWithSignatureUseCase;
import org.springframework.stereotype.Service;

@Service
public class CreateUserWithSignatureUseCaseImpl implements CreateUserWithSignatureUseCase {

    private final UserClient userClient;
    private final SignatureClient signatureClient;

    public CreateUserWithSignatureUseCaseImpl(UserClient userClient, SignatureClient signatureClient) {
        this.userClient = userClient;
        this.signatureClient = signatureClient;
    }

    @Override
    public CreateUserWithSignatureResponse execute(CreateUserWithSignatureRequest input) {
        return null;
    }
}
