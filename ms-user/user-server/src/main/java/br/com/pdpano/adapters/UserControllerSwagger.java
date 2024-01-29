package br.com.pdpano.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.domain.User;
import br.com.pdpano.usecase.createuser.CreateUserInput;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import java.util.List;

interface UserControllerSwagger {
    @Operation(description = "Creates an user")
    ResponseEntity<ResponseMessage<Long>> createUser(CreateUserInput user);

    @Operation(description = "Get user by identifier")
    ResponseEntity<ResponseMessage<User>> getUserById(Long userId);

    @Operation(description = "Get users")
    ResponseEntity<ResponseMessage<List<User>>> getUsers();

    @Operation(description = "Update user by identifier")
    ResponseEntity<ResponseMessage<Long>> updateUser(Long userId, User user);

    @Operation(description = "Delete user by identifier")
    ResponseEntity<ResponseMessage<Long>> deleteUser(Long userId);
}