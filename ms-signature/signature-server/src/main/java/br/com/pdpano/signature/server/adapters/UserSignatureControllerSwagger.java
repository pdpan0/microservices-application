package br.com.pdpano.signature.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.signature.client.requests.CreateSignatureRequest;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;


public interface UserSignatureControllerSwagger {
    @Operation
    ResponseEntity<ResponseMessage<Long>> createUserSignature(CreateSignatureRequest request);

    @Operation(description = "Commit user signature")
    ResponseEntity<ResponseMessage<Void>> commitUserSignature(Long userSignatureId);

}