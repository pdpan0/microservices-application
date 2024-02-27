package br.com.pdpano.user.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.user.server.domain.User;
import br.com.pdpano.user.client.requests.CreateUserRequest;
import br.com.pdpano.user.server.usecase.io.CreateUserInput;
import br.com.pdpano.user.server.usecase.CreateUserUseCase;
import br.com.pdpano.user.server.usecase.GetUserByUuidUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController implements UserControllerSwagger {

    private final CreateUserUseCase createUserUseCase;
    private final GetUserByUuidUseCase getUserByUuidUseCase;

    public UserController(
            CreateUserUseCase createUserUseCase,
            GetUserByUuidUseCase getUserByUuidUseCase
    ) {
        this.createUserUseCase = createUserUseCase;
        this.getUserByUuidUseCase = getUserByUuidUseCase;
    }

    @PostMapping
    public ResponseEntity<ResponseMessage<UUID>> createUser(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok(
                ResponseMessage.build(
                        createUserUseCase.execute(
                                new CreateUserInput(request.name(), request.username(), request.password(), request.confirmationPassword())
                        )));
    }

    @GetMapping("{uuid}")
    public ResponseEntity<ResponseMessage<User>> getUserById(@PathVariable("uuid") UUID uuid) {
        return ResponseEntity.ok(ResponseMessage.build(getUserByUuidUseCase.execute(uuid)));
    }

}
