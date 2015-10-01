package com.amdudda;

import java.util.ArrayList;

public class DogManager {

    public static void main(String[] args) {
	// Lab 6, Adv Prob 1
        // set up an arraylist to store our dogs
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        // generate our data
        makeDogs(dogList);

        // write out weekly report of dog walks
        writeWeeklyReport(dogList);

    } // end main

    public static void makeDogs(ArrayList<Dog> dL) {
        // make some fictitious dogs
        int[] roverschedule = {1,0,6,0,1,0,2};
        Dog rover = new Dog("Rover","1 Pine Street",roverschedule);
        int[] bozschedule = {2,0,0,3,1,0,0};
        Dog boz = new Dog("Boz","99 Bottles Lane",bozschedule);
        int[] k9schedule = {1,0,0,1,0,1,1};  // binary ascii for 'K'
        Dog k9 = new Dog("K9","The Tardis",k9schedule);
        int[] lassiesched = {1,1,1,1,1,1,1};

        dL.add(rover);
        dL.add(boz);
        dL.add(k9);
        dL.add(new Dog("Lassie","101 Flicka's Pier",lassiesched));

        /* debugging: proof Dog works
        rover.writeDog();
        boz.writeDog();
        rk9.writeDog();
        */
    }

    public static void writeWeeklyReport(ArrayList<Dog> dL) {
        for (int i = 0; i<7; i++) {
            int walks_today = totalDaysWalks(dL,i);
            System.out.print(getDayName(i) + ":");
            if (walks_today > 6 ) System.out.println("    **WARNING: MORE THAN 6 WALKS SCHEDULED TODAY!**");
            else System.out.println("");
            for (Dog j : dL) {
                j.writeWalkInfo(i);
            } // end run through dogList
            // print total number of walks for the day
            System.out.println("\tTotal walks to give today: " + walks_today);
        } // end run through days of week
    }

    public static int totalDaysWalks(ArrayList<Dog> dL, int day) {
        // returns the total number of walks for a given day
        int totalwalks = 0;
        for (Dog d:dL) {
            totalwalks += d.getWalks(day);
        }
        return totalwalks;
    }

    public static String getDayName(int index) {
        // retrieves a day name based on a number
        // this started as a method for Dog, but I need it to generate my weekly walks report.
        switch (index) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Day unknown";  // in case we have bad data
        } // end switch
    } // end method getDayName

} // end DogManager
