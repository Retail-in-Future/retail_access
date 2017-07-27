package com.thoughtworks.retail_access.builder;


import com.thoughtworks.retail_access.model.AccessDevice;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AccessDeviceBuilderTest {

    @Test
    public void should_open_gate_and_light_green_when_permitted() {
        AccessDevice accessDevice = new AccessDevice(true);
        assertThat(accessDevice.getGate(), is("open"));
        assertThat(accessDevice.getLight(), is("green"));
    }

    @Test
    public void should_close_gate_and_light_red_when_not_permitted() {
        AccessDevice accessDevice = new AccessDevice(false);
        assertThat(accessDevice.getGate(), is("close"));
        assertThat(accessDevice.getLight(), is("red"));
    }
}