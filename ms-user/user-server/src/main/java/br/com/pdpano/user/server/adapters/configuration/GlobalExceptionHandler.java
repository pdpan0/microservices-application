package br.com.pdpano.user.server.adapters.configuration;

import br.com.pdpano.commons.ResponseErrorMessage;
import br.com.pdpano.user.server.domain._exceptions.PasswordException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    public ResponseErrorMessage<Void> handleException(Exception exception) {
        return ResponseErrorMessage.build(exception);
    }

    @ExceptionHandler(PasswordException.class)
    @ResponseStatus(BAD_REQUEST)
    public ResponseErrorMessage<Void> handlePasswordException(PasswordException exception) {
        return ResponseErrorMessage.build(exception);
    }
}
