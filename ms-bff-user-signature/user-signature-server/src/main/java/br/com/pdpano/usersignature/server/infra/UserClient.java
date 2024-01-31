package br.com.pdpano.usersignature.server.infra;

import br.com.pdpano.commons.ResponseMessage;
import br.com.pdpano.user.client.requests.CreateUserRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user", url = "${integration.ms-user.domain}:${integration.ms-user.port}")
public interface UserClient {

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    ResponseMessage<Long> createUser(CreateUserRequest user);

}
