package com.LeahGrace;


public class ReverseTheNumber {
            public static String rev(int n) {
                if (n < 0){
                    n = n * (-1);
                }
                String newNum = String.valueOf(n);
                String returnNum = "";
                for (int i = newNum.length() - 1; i >= 0; i--){
                    returnNum += newNum.charAt(i);
                }
                System.out.println(returnNum);
                return returnNum;

            }
        }


