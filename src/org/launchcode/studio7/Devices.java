package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class Devices {

    private String name;
    private int storageCap;
    private int remainingCap;
    private int capacityUsed;
    private String discType;
    private ArrayList<String> contents = new ArrayList<>();

    public Devices(String name, int storageCap, String discType) {
        this.name = name;
        this.storageCap = storageCap;
        this.discType = discType;
    }

    public int getRemainingCap() {
        return this.storageCap - this.capacityUsed;
    }

    public String getDiscInfo() {
        return "Name: " + this.name + " Space used: " + this.capacityUsed;
    }
}
