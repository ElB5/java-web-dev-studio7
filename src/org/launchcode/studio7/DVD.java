package org.launchcode.studio7;

public class DVD extends Devices implements myInter {
    public DVD(String name, int storageCap, String discType) {
        super(name, storageCap, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 32k rpm.");
    }

    @Override
    public void readData() {
        System.out.println("I'm sorry - I can't do that");
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.


    //method:


}
