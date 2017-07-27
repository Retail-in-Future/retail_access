package com.thoughtworks.retail_access.model;


import java.util.HashMap;
import java.util.Map;


/**
 * Created by zguo on 17/7/27.
 */
public class AccessDevice {

    private String gate;
    private String light;

    public AccessDevice(Boolean isPermitted) {
        gate = isPermitted ? "open" : "close";
        light = isPermitted ? "green" : "red";
    }

    public String getGate() {
        return gate;
    }


    public String getLight() {
        return light;
    }

    public Map<String, String> buildValueObject() {

        return new HashMap<String, String>(){{
            put("gate", gate);
            put("light", light);
        }};

    }

}
