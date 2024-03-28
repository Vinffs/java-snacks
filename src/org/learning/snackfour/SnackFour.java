package org.learning.snackfour;

import java.util.Scanner;

public class SnackFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Palindrome Validator");
        System.out.print("Insert a word or a sentence: ");

        String userInput = scan.nextLine();
        String cleanInput = userInput.replaceAll("\\s+", "").toUpperCase();

        boolean flag = true;

        for (int i = 0; i < cleanInput.length() ; i++) {
            if(cleanInput.charAt(i) != cleanInput.charAt(cleanInput.length() -1 - i)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("The word " + userInput + " is a Palindrome!");
        } else {
            System.out.println("The word " + userInput + " is NOT a Palindrome!");
        }

        scan.close();
    }
}

