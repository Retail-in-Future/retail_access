package com.thoughtworks.retail_access.agent;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zguo on 17/7/27.
 */
@FeignClient(name = "middleware", url = "${service.middleware.url}")
public interface MiddlewareAgent {

    @RequestMapping(value = "/api/things/", method = RequestMethod.POST)
    String access(@RequestBody String requestBody);
}
