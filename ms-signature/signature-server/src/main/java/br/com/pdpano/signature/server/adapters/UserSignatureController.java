package br.com.pdpano.signature.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.signature.client.requests.CreateSignatureRequest;
import br.com.pdpano.signature.server.usecase.CommitUserSignatureUseCase;
import br.com.pdpano.signature.server.usecase.CreateUserSignatureUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user-signatures")
@RestController
public class UserSignatureController implements UserSignatureControllerSwagger {

    private final CreateUserSignatureUseCase createUserSignatureUseCase;
    private final CommitUserSignatureUseCase commitUserSignatureUseCase;

    public UserSignatureController(
            CreateUserSignatureUseCase createUserSignatureUseCase,
            CommitUserSignatureUseCase commitUserSignatureUseCase
    ) {
        this.createUserSignatureUseCase = createUserSignatureUseCase;
        this.commitUserSignatureUseCase = commitUserSignatureUseCase;
    }

    @Override
    public ResponseEntity<ResponseMessage<Long>> createUserSignature(CreateSignatureRequest request) {
        return null;
    }

    @GetMapping("{userSignatureId}")
    public ResponseEntity<ResponseMessage<Void>> commitUserSignature(@PathVariable("userSignatureId") Long userSignatureId) {
        return ResponseEntity.ok(
                ResponseMessage.build(commitUserSignatureUseCase.execute(userSignatureId))
        );
    }
}
