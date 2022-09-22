package org.launchcode.studio7;

public class CD extends Devices implements myInter {
    public CD(String name, int storageCap, String discType) {
        super(name, storageCap, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 23k rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Would you like to plan a game?");
    }



}

