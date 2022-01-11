package com.LeahGrace;

import java.util.Arrays;

public class ReturnMinMaxnumber {

        public static int differenceMaxMin(int[] arr) {
            Arrays.sort(arr);

            int min = arr[0];
            int max = arr[arr.length - 1];
            return max - min;

        }
    }

