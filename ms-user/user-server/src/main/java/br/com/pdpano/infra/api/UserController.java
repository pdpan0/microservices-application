package br.com.pdpano.infra.api;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.domain.User;
import br.com.pdpano.usecase.createuser.CreateUserInput;
import br.com.pdpano.usecase.createuser.CreateUserUseCase;
import br.com.pdpano.usecase.getuserbyid.GetUserByIdUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

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

}
