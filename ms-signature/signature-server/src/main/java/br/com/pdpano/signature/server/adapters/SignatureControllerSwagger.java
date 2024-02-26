package br.com.pdpano.signature.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.signature.server.domain.Signature;
import br.com.pdpano.signature.server.usecase.io.CreateSignatureInput;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;

import java.util.List;

interface SignatureControllerSwagger {

    @Operation(description = "Create signature")
    ResponseEntity<ResponseMessage<Long>> createSignature(CreateSignatureInput input);

    @Operation(description = "Get signatures")
    ResponseEntity<ResponseMessage<List<Signature>>> getSignatures();
}