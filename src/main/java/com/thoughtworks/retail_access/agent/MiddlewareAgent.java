package com.thoughtworks.retail_access.agent;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Service
@FeignClient(name = "middleware", url = "${service.middleware.url}")
public interface MiddlewareAgent {

    @RequestMapping(value = "/api/things/{device_name}", method = RequestMethod.POST)
    String access(@PathVariable("device_name") String deviceName, @RequestBody Map<String, String> requestBody);
}
