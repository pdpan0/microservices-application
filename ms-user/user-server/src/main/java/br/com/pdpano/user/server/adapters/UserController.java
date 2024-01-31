package br.com.pdpano.user.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.user.server.domain.User;
import br.com.pdpano.user.client.requests.CreateUserRequest;
import br.com.pdpano.user.server.usecase.createuser.CreateUserInput;
import br.com.pdpano.user.server.usecase.createuser.CreateUserUseCase;
import br.com.pdpano.user.server.usecase.getuserbyid.GetUserByIdUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController implements UserControllerSwagger {

    private final CreateUserUseCase createUserUseCase;
    private final GetUserByIdUseCase getUserByIdUseCase;

    public UserController(
            CreateUserUseCase createUserUseCase,
            GetUserByIdUseCase getUserByIdUseCase
    ) {
        this.createUserUseCase = createUserUseCase;
        this.getUserByIdUseCase = getUserByIdUseCase;
    }

    @PostMapping
    public ResponseEntity<ResponseMessage<Long>> createUser(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok(
                ResponseMessage.build(
                        createUserUseCase.execute(
                                new CreateUserInput(
                                        request.name(),
                                        request.username(),
                                        request.password(),
                                        request.confirmationPassword()
                                ))));
    }

    @GetMapping("{userId}")
    public ResponseEntity<ResponseMessage<User>> getUserById(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(ResponseMessage.build(getUserByIdUseCase.execute(userId)));
    }

    @GetMapping
    public ResponseEntity<ResponseMessage<List<User>>> getUsers() {
        throw new RuntimeException("Not yet implemented");
    }

    @PutMapping("{userId}")
    public ResponseEntity<ResponseMessage<Long>> updateUser(
            @PathVariable("userId") Long userId,
            @RequestBody User user
    ) {
        throw new RuntimeException("Not yet implemented");
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<ResponseMessage<Long>> deleteUser(@PathVariable("userId") Long userId) {
        throw new RuntimeException("Not yet implemented");
    }
}
