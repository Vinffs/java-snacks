package org.learning.snacktwo;

import java.util.Random;

public class SnackTwo {
    public static void main(String[] args) {
        String[] names = {"Emily", "Liam", "Sophia", "Jackson", "Ava", "Noah", "Olivia", "Ethan", "Isabella",
                "Benjamin"};

        String[] surnames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
                "Taylor"};


        Random randomGenerator = new Random();
        int nameRndNumber, surnameRndNumber;


        System.out.println("Guest List:");

        for (int i = 0; i < 10 ; i++) {

            nameRndNumber  = randomGenerator.nextInt(names.length);
            surnameRndNumber = randomGenerator.nextInt(surnames.length);

            String randomPerson = names[nameRndNumber] + " " + surnames[surnameRndNumber];

            System.out.println((i + 1) + ". " + randomPerson);
        }
    }
}
