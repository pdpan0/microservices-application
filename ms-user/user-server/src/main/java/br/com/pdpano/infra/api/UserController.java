package br.com.pdpano.infra.api;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.domain.User;
import br.com.pdpano.usecase.createuser.CreateUserInput;
import br.com.pdpano.usecase.createuser.CreateUserUseCase;
import br.com.pdpano.usecase.getuserbyid.GetUserByIdUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
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
    public ResponseEntity<ResponseMessage<Long>> createUser(@RequestBody CreateUserInput user) {
        return ResponseEntity.ok(ResponseMessage.build(createUserUseCase.execute(user)));
    }

    @GetMapping("{userId}")
    public ResponseEntity<ResponseMessage<User>> getUserById(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(ResponseMessage.build(getUserByIdUseCase.execute(userId)));
    }

    @GetMapping
    public ResponseEntity<ResponseMessage<List<User>>> getUsers() {
        return ResponseEntity.ok(ResponseMessage.build(Collections.emptyList())); //todo
    }

    @PutMapping("{userId}")
    public ResponseEntity<ResponseMessage<Long>> updateUser(
            @PathVariable("userId") Long userId,
            @RequestBody User user
    ) {
        return ResponseEntity.ok(ResponseMessage.build(userId)); //todo
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<ResponseMessage<Long>> deleteUser(@PathVariable("userId") Long userId) {
        return ResponseEntity.ok(ResponseMessage.build(userId)); //todo
    }
}
