package com.amdudda;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by amdudda on 9/30/2015.
 */
public class Dog {
    // attributes of class Dog
    private String name;  // dog's name
    private String address;  // owner's address
    private int[] schedule;  // array size 7, index 0 = Sunday..6 = Saturday

    // Constructor
    public Dog(String dogName, String ownerAddress, int[] walkSchedule) {
        this.name = dogName;
        this.address = ownerAddress;
        this.schedule = walkSchedule;
    } // end constructor for Dog

    public int getWalks(int day) {
        // returns number of walks for a particular weekday.
        // public because there might be situations where you want to access the number of walks a dog has on a given day.
        return this.schedule[day];
    } // end method getWalks

    public String getAddress() {
        return this.address;
    } // end method getAddress

    public void setAddress(String neue_addresse) {
        this.address = neue_addresse;
    } // end setter for address

    public String getName() {
        return this.name;
    } // end method getName

    public void setName(String neuer_name) {
        this.name = neuer_name;
    } // end setter for name

    public int[] getScheduleArray() {
        return this.schedule;
    } // getter for the array holding the walk schedule

    public void setScheduleArray(int[] sched) {
        for (int i =0; i<7; i++) {
            this.schedule[i] = sched[i];
        } // end for
    } // setter for the array holding the walk schedule

    // DONE: public method to update schedule for a dog.
    public void setSchedule() throws IOException {
        // lets user update a dog's weekly schedule
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            while (true) {
                try {
                    System.out.println("How may walks does " + this.getName() + " get on " + DogManager.getDayName(i) + "?");
                    this.schedule[i] = s.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("I don't understand your input.  Please enter a whole number.");
                    s = new Scanner(System.in);
                }  // end try-catch
            } // end while
        } // end for
        System.out.println(this.getName() + "'s schedule is now:");
        this.writeDog();
    } // end method setSchedule

    private String fetchSchedule() {
        // returns a dog's weekly schedule, private because it's only used by module writeDog.
        String sched = "";
        String sing_or_pl;
        for (int j = 0; j < 7; j++) {
            if (this.getWalks(j) == 1) sing_or_pl = " walk";
            else sing_or_pl = " walks";
            sched += ("\t" + DogManager.getDayName(j) + ": " + this.getWalks(j) + sing_or_pl + ".\n");
        } // end for
        return sched;
    } // end method fetchSchedule

    protected void writeDog() {
        // writes the dog's info and schedule, protected because it's just printing out info
        System.out.println(this.name + ", " + this.address + ":");
        // write the dog's schedule
        System.out.println(this.fetchSchedule());
    } // end method writeDog

    protected void writeWalkInfo(int day) {
        // prints dog's name, number of walks, and address for a given day
        // protected because this should only output information, not interact with data
        String sing_or_pl;
        if (this.getWalks(day) == 1) sing_or_pl = " time";
        else sing_or_pl = " times";
        System.out.println("\tWalk " + this.name + " " + this.getWalks(day) + sing_or_pl +
                ". Address: " + this.address);
    } // end method getWalkInfo

} // end class Dog
