package com.LeahGrace;

public class VideoLength {
        public static int minutesToSeconds(String tm) {
            int minutes = Integer.parseInt( tm.split(":")[0] );
            int seconds = Integer.parseInt( tm.split(":")[1] );

            if (seconds >= 60) return -1;

            return seconds + 60*minutes;
        }

}
