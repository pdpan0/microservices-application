package br.com.pdpano.user.server.adapters;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.user.server.domain.User;
import br.com.pdpano.user.client.requests.CreateUserRequest;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.UUID;

interface UserControllerSwagger {
    @Operation(description = "Creates an user")
    ResponseEntity<ResponseMessage<UUID>> createUser(CreateUserRequest user);

    @Operation(description = "Get user by identifier")
    ResponseEntity<ResponseMessage<User>> getUserById(UUID userId);
}