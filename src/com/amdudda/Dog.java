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
        System.out.println(this.getSchedule());
    } // end method writeDog

    public int getWalks (int day) {
        // returns number of walks for a particular weekday.
        return this.schedule[day];
    }

    public String getAddress(){
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public String getSchedule(){
        // returns a dog's weekly schedule
        String sched = "";
        for (int j = 0; j<7; j++) {
           sched += ("\t" + getDayName(j) + ": " +
                    this.getWalks(j) + " walks.\n");
        } // end for
        return sched;
    }

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
