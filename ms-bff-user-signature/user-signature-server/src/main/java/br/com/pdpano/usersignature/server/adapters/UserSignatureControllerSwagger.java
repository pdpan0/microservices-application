package br.com.pdpano.usersignature.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.usersignature.client.requests.CreateUserWithSignatureRequest;
import br.com.pdpano.usersignature.client.responses.CreateUserWithSignatureResponse;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;

interface UserSignatureControllerSwagger {
    @Operation(description = "Creates an user with signature")
    ResponseEntity<ResponseMessage<CreateUserWithSignatureResponse>> createUserWithSignature(
            CreateUserWithSignatureRequest request
    );
}