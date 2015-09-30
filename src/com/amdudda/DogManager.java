package com.amdudda;

public class DogManager {

    public static void main(String[] args) {
	// Lab 6, Adv Prob 1
        // make some fictitious dogs
        int[] roverschedule = {1,0,1,0,1,0,2};
        Dog rover = new Dog("Rover","1 Pine Street",roverschedule);

        // debugging: proof Dog works
        rover.writeDog();
    }
}
