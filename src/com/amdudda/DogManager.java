package com.amdudda;

public class DogManager {

    public static void main(String[] args) {
	// Lab 6, Adv Prob 1
        // make some fictitious dogs
        int[] roverschedule = {1,0,1,0,1,0,2};
        Dog rover = new Dog("Rover","1 Pine Street",roverschedule);
        int[] bozschedule = {2,0,0,3,1,0,0};
        Dog boz = new Dog("Boz","99 Bottles Lane",bozschedule);
        int[] k9schedule = {1,0,0,1,0,1,1};  // binary ascii for 'K'
        Dog k9 = new Dog("K9","The Tardis",k9schedule);

        /* debugging: proof Dog works
        rover.writeDog();
        boz.writeDog();
        rk9.writeDog();
        */

        // write out weekly report of dog walks
        for (int i = 0; i<7; i++) {
            System.out.println("For day number " + i + ":");
            rover.writeWalkInfo(i);
            boz.writeWalkInfo(i);
            k9.writeWalkInfo(i);
        }

    } // end main
} // end DogManager
