package com.LeahGrace;

public class DoubleLetters {
        public static boolean doubleLetters(String word) {
            boolean doubles = false;
            for (byte i = 0; i < word.length() - 1; i++){
                if (word.charAt(i) == word.charAt(i + 1)){
                    doubles = true;
                    break;
                }
            }
            return doubles;
        }
    }
