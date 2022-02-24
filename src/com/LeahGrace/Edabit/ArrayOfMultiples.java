package com.LeahGrace.Edabit;

import java.util.*;

public class ArrayOfMultiples {

    public class Program {
        public static int[] arrayOfMultiples(int num, int length) {
            int[] arr = new int[length];
            for (int i = 0; i < length; i++){
                arr[i] = num * (i + 1);
            }
            return arr;
        }
    }
}
