package com.LeahGrace;

public class ExistsHigherNum {
    public ExistsHigherNum(int[] ints, int i) {
    }
    public static boolean ExistsHigherNum(int[] arr, int n) {
        for (int num : arr) {
            if (n < num){
                return true;
            }
        }
        return false;
    }
}
