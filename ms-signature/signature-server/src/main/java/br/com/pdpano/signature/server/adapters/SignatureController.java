package br.com.pdpano.signature.server.adapters;

import br.com.pdpano.signature.server.usecase.CreateSignatureUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("signatures")
@RestController
public class SignatureController {

    private final CreateSignatureUseCase createSignatureUseCase;

    public SignatureController(CreateSignatureUseCase createSignatureUseCase) {
        this.createSignatureUseCase = createSignatureUseCase;
    }

}
