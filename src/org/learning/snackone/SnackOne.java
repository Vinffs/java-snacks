package org.learning.snackone;

import java.util.Scanner;

public class SnackOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert a number between 10 and 20: ");
        int num = Integer.parseInt(scan.nextLine());


        while((num < 10 || num > 20) || num % 2 != 0) {
            System.out.print("Number Invalid. Please insert a EVEN number between 10 and 20: ");
            num = Integer.parseInt(scan.nextLine());
        }

        System.out.println("Your number is valid: " + num);

        scan.close();
    }
}
