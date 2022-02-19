package com.LeahGrace;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;

public class ValidPalindrome {
    class Solution {
        public static boolean isPalindrome(String s) {
            boolean determination = true;
            //remove non-alphanumerics and spaces
            String newStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            //find half-way point
            int halfMark = newStr.length()/2;
            ArrayList<Character> stack = new ArrayList<>();

            for (int i = newStr.length() -1; i >= halfMark; i--){
                stack.add(newStr.charAt(i));
            }
            System.out.println(stack);

            for (int j = 0; j < halfMark; j++){
                if (newStr.charAt(j) != stack.get(j)){
                    determination = false;
                }
            }



            return determination;

        }



    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        //String str = "abcde f g h xgfedcba";
        System.out.println(Solution.isPalindrome(str));

        //   amanaplana c analpanama

    }
}
