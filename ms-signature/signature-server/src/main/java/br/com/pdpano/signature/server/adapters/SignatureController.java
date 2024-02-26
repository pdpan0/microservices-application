package br.com.pdpano.signature.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.signature.server.domain.Signature;
import br.com.pdpano.signature.server.usecase.CreateSignatureUseCase;
import br.com.pdpano.signature.server.usecase.GetSignaturesUseCase;
import br.com.pdpano.signature.server.usecase.io.CreateSignatureInput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("signatures")
@RestController
public class SignatureController implements SignatureControllerSwagger {

    private final CreateSignatureUseCase createSignatureUseCase;
    private final GetSignaturesUseCase getSignaturesUseCase;

    public SignatureController(
            CreateSignatureUseCase createSignatureUseCase,
            GetSignaturesUseCase getSignaturesUseCase
    ) {
        this.createSignatureUseCase = createSignatureUseCase;
        this.getSignaturesUseCase = getSignaturesUseCase;
    }

    @PostMapping
    public ResponseEntity<ResponseMessage<Long>> createSignature(@RequestBody CreateSignatureInput input) {
        return ResponseEntity.ok(ResponseMessage.build(createSignatureUseCase.execute(input)));
    }

    @GetMapping
    public ResponseEntity<ResponseMessage<List<Signature>>> getSignatures() {
        return ResponseEntity.ok(ResponseMessage.build(getSignaturesUseCase.execute(null)));
    }
}
