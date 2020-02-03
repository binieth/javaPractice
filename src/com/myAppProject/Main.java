package com.myAppProject;

public class Main {

    public static void main(String[] args) {
        int jarOne = 3;
        int jarTwo = 7;

        System.out.println("initial jarOne contains :" + " " + jarOne);
        System.out.println("initial jarTwo contains :" + " " + jarTwo);

        // I want to swap the number in jarTwo into jarOne and the number in jarOne into jarTwo.

        int emptyJar = jarOne;
        jarOne = jarTwo;
        jarTwo = emptyJar;

        System.out.println("After swap jarOne contains: " + jarOne);
        System.out.println("After swap jarTwo contains: " + jarTwo);

        System.out.println("Sunday 02 Feb 2020");

    }
}
