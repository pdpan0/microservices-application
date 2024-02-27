package br.com.pdpano.usersignature.server.usecase;

import br.com.pdpano.commons.UseCase;
import br.com.pdpano.usersignature.client.requests.CreateUserWithSignatureRequest;
import br.com.pdpano.usersignature.client.responses.CreateUserWithSignatureResponse;

// todo: dont use request or response.
public interface CreateUserWithSignatureUseCase extends UseCase<CreateUserWithSignatureRequest, CreateUserWithSignatureResponse> {
    @Override
    CreateUserWithSignatureResponse execute(CreateUserWithSignatureRequest input);
}
