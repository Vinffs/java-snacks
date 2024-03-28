package org.learning.snackfive;

import java.util.Scanner;

public class SnackFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Characters Checker");
        System.out.print("Please insert text here: ");
        String userInput = scan.nextLine();
        String cleanInput = userInput.replaceAll(" ", "");

        int letters = 0;
        int numbers = 0;
        int symbols = 0;

        for (int i = 0; i < cleanInput.length() ; i++) {
            char c = cleanInput.charAt(i);

            if(Character.isLetter(c)) {
                letters++;
            } else if(Character.isDigit(c)){
                numbers++;
            } else {
                symbols++;
            }
        }

        System.out.println("The inserted text has : " + letters + " letters, " + numbers + " numbers, and " + symbols + " Symbols.");


        scan.close();
    }
}
