package br.com.pdpano.user.server.createuser;

import br.com.pdpano.user.server.domain._exceptions.PasswordException;
import br.com.pdpano.user.server.usecase.createuser.CreateUserInput;
import br.com.pdpano.user.server.usecase.createuser.CreateUserUseCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CreateUserUseCaseTest {

    private final CreateUserUseCase createUserUseCase;

    @Autowired
    public CreateUserUseCaseTest(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @Test
    public void whenPasswordAndConfirmationPasswordDoesntMatchThenReturnPasswordException() {
        final CreateUserInput user = new CreateUserInput(
                "lucas",
                "pdpano",
                "teste123",
                "teste1234"
        );

        assertThrows(PasswordException.class, () -> createUserUseCase.execute(user));
    }
}