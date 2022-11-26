package com.example.ijpowerballlotterynumberpicker2;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class NumberSelector {

    public static void main(String[] args) {

        int[] MOST_FREQUENT_NUMBER_POOL = {21, 32, 61, 3, 23, 53, 59, 63, 69, 10, 17, 20, 27, 28, 36, 39,
                                           40, 62, 64, 8, 12, 16, 33, 37, 67, 1, 41, 47, 52, 54, 14, 15, 22, 38, 44};

        displayNumbersTitle(MOST_FREQUENT_NUMBER_POOL);

        int i = 0;
        Set<Integer> mySet = new HashSet<>();
        while (i < 10) {
            while (mySet.size() < 5) {
                // I don't like most comments. The ones I do like describe why code is there not what its doing
                pickNextLottoNumber(MOST_FREQUENT_NUMBER_POOL, mySet);
            }
            System.out.print(mySet + "      ");

                     int[] MOST_FREQUENT_POWERBALL_NUMBERS = {24, 18, 3, 4, 6, 10, 13, 19, 21, 8, 9, 11, 17};

                      Set<Integer> mySet2 = new HashSet<>();
                      while (mySet2.size() < 1) {
                          pickPowerBallNumber(MOST_FREQUENT_POWERBALL_NUMBERS, mySet2);
                       }

                         System.out.println("Powerball Number: " + mySet2);

            mySet.clear();
            mySet2.clear();
            i++;
        }





    }   //end of Main



    private static void displayNumbersTitle(int[] MOST_FREQUENT_NUMBER_POOL) {
        /*System.out.print("Your pool of frequent numbers is this long: " +
                MOST_FREQUENT_NUMBER_POOL.length +
                "\n\nPower Ballll Lotto \nHere are your numbers: \n\n");*/

        System.out.print("\nPowerball Lotto \nHere are your numbers: \n\n");


    }

    private static void pickNextLottoNumber(int[] MOST_FREQUENT_NUMBER_POOL, Set<Integer> mySet) {
        int randomIndexSpot = ThreadLocalRandom.current().nextInt(0, MOST_FREQUENT_NUMBER_POOL.length);
        mySet.add(MOST_FREQUENT_NUMBER_POOL [randomIndexSpot]);
    }


    private static void pickPowerBallNumber(int[] MOST_FREQUENT_POWERBALL_NUMBERS, Set<Integer> mySet2) {
        int randomIndexSpot2 = ThreadLocalRandom.current().nextInt(0, MOST_FREQUENT_POWERBALL_NUMBERS.length);
        mySet2.add(MOST_FREQUENT_POWERBALL_NUMBERS [randomIndexSpot2]);
    }



}









