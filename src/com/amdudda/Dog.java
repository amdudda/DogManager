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
    } // end method getWalks

    public String getAddress(){
        return this.address;
    } // end method getAddress

    public String getName() {
        return this.name;
    } // end method getName

    public String getSchedule(){
        // returns a dog's weekly schedule
        String sched = "";
        for (int j = 0; j<7; j++) {
           sched += ("\t" + DogManager.getDayName(j) + ": " + this.getWalks(j) + " walks.\n");
        } // end for
        return sched;
    } // end method getSchedule

    public void writeWalkInfo(int day) {
        // prints dog's name, number of walks, and address for a given day
        String sing_or_pl;
        if (this.getWalks(day) == 1) sing_or_pl = " time";
        else sing_or_pl = " times";
        System.out.println("\tWalk " + this.name + " " + this.getWalks(day) + sing_or_pl +
                ". Address: " + this.address);
    } // end method getWalkInfo

} // end class Dog
