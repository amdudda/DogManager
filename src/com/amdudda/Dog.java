package com.amdudda;

/**
 * Created by amdudda on 9/30/2015.
 */
public class Dog {
    // attributes of class Dog
    private String name;
    private String address;
    private int[] schedule;  // array size 7, index 0 = Sun...6 = Saturday

    // Constructor
    public Dog (String dogName, String ownerAddress, int[] walkSchedule) {
        this.name = dogName;
        this.address = ownerAddress;
        this.schedule = walkSchedule;
    } // end constructor for Dog

    public void writeDog() {
        // writes the dog's info and schedule
        System.out.println(this.name + ", " + this.address + ":");
        // write the dog's schedule
        for (int j = 0; j<7; j++) {
            System.out.println("\t" + getDayName(j) + ": " +
             this.schedule[j] + " walks.");
        } // end for
    } // end method writeDog

    private String getDayName(int index) {
        // retrieves a day name based on a number
        switch (index) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Day unknown";
        } // end switch
    } // end method getDayName

} // end class Dog
