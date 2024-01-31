package br.com.pdpano.usersignature.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.usersignature.client.requests.CreateUserWithSignatureRequest;
import br.com.pdpano.usersignature.server.usecase.CreateUserWithSignatureUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-signatures")
public class UserSignatureController implements UserSignatureControllerSwagger {

    private final CreateUserWithSignatureUseCase createUserWithSignatureUseCase;

    public UserSignatureController(CreateUserWithSignatureUseCase createUserWithSignatureUseCase) {
        this.createUserWithSignatureUseCase = createUserWithSignatureUseCase;
    }

    @PostMapping
    public ResponseEntity<ResponseMessage<Void>> createUserWithSignature() {
        return ResponseEntity.ok(ResponseMessage.build(createUserWithSignatureUseCase.execute(null)));
    }

    @Override
    public ResponseEntity<ResponseMessage<Long>> createUserWithSignature(CreateUserWithSignatureRequest request) {
        return null;
    }
}
