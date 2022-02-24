package com.LeahGrace.Edabit;

import java.util.stream.IntStream;

public class HowMuchIsTrue {

    public class Challenge {
        public static int countTrue(boolean[] arr) {
            int counter = 0;
            for (boolean bool : arr){
                if (bool == true){
                    counter++;
                }
            }
            return counter;
        }
    }
}
