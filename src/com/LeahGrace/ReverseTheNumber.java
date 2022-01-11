package com.LeahGrace;


public class ReverseTheNumber {
    public static void main(int n) {

            //create placeholder String to return answer
            String reversedNum = "";
            //if n is negative covert to positive
            if (n < 0){
                n = n * -1;
            }
            //convert n to a string
            String strNum = String.valueOf(n);
            System.out.println(strNum.length());


        }
    }

