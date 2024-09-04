package Exercises_193.Exercise1;

import Exercises_193.Exercise1.Cycle;

public class Exercise {
    public static void main(String[] args) {
        Cycle myUnicycle = new Unicycle();
        Cycle myBicycle = new Bicycle();
        Cycle myTricycle = new Tricycle();

        myUnicycle.ride(1); 
        myBicycle.ride(2);  
        myTricycle.ride(3); 
    }
}
