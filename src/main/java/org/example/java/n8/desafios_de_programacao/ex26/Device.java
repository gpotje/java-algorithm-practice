package org.example.java.n8.desafios_de_programacao.ex26;

import java.util.ArrayList;
import java.util.List;

public class Device {
    private String name;
    private StatusDevice status;
    private List<String> connected;

    public Device(String name) {
        this.name = name;
        this.status = StatusDevice.OFF;
        this.connected = new ArrayList<>();

    }

    public void addDeviceConnected(String connected) {
        this.connected.add(connected);
    }

    public String getName() {
        return name;
    }

    public List<String> getConnected() {
        return connected;
    }

    public void setStatus(StatusDevice status) {
        this.status = status;
    }

    public boolean isTurn() {
        return status == StatusDevice.ON ? true : false;
    }

    @Override
    public String toString() {
        return name + " (" + status + ")";
    }
}
