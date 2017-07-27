package com.thoughtworks.retail_access.controller;

import com.thoughtworks.retail_access.agent.MiddlewareAgent;
import com.thoughtworks.retail_access.model.AccessDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccessController {

    @Autowired
    private MiddlewareAgent middlewareAgent;

    @Value("${device.access.name}")
    private String deviceName;

    @RequestMapping(value = "/access", method = RequestMethod.POST)
    public String access(@RequestParam("is_permitted") Boolean isPermitted) {
        return middlewareAgent.access(deviceName, new AccessDevice(isPermitted).buildValueObject());
    }
}
