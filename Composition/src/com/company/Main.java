package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B", "dell", "240", dimensions);

	    // here we can just new Resolution() so thats created a instance of the class without using a variable
	    Monitor theMonitor = new Monitor("27inch", "HP", 32,new Resolution(2540,1440));

	    Motherboard theMotherboard = new Motherboard("BJ-200", " Apple",4,5,"v2.44");

	    // Now we have created the PC class by passing those three objects to it.
	    PC thePC = new PC(theCase, theMonitor,theMotherboard );
	    thePC.powerUp();
    }
}
