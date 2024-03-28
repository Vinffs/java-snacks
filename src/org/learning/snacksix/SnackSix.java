package org.learning.snacksix;

import java.util.Scanner;

public class SnackSix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int SECONDS_IN_MINUTE = 60;
        final int MINUTES_IN_HOUR = 3600;

        System.out.print("Insert seconds: ");
        int userInput = Integer.parseInt(scan.nextLine());


        int hours = userInput / MINUTES_IN_HOUR;

        int secondsLeft = userInput % MINUTES_IN_HOUR;
//        System.out.println(sparedSeconds);

        int minutes = secondsLeft / SECONDS_IN_MINUTE;

        int seconds = secondsLeft % SECONDS_IN_MINUTE;
//        System.out.println(seconds);


        String secondsFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        System.out.println(userInput + " seconds formatted are: " + secondsFormatted + " hours.");
                
        scan.close();
    }
}
