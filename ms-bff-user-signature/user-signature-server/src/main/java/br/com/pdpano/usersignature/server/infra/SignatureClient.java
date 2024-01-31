package br.com.pdpano.usersignature.server.infra;

import br.com.pdpano.commons.ResponseMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "signature", url = "${integration.ms-signature.domain}:${integration.ms-user.port}")
public interface SignatureClient {
    @RequestMapping(method = RequestMethod.POST, value = "/signatures")
    ResponseMessage<Long> createSignature();
}
