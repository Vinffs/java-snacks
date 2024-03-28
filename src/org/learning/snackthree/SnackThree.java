package org.learning.snackthree;

public class SnackThree {
    public static void main(String[] args) {

        int[] numbers = {53, 17, 89, 42, 65, 28, 91, 34, 76, 10};


        int sum = 0;
        for (int i = 1; i <= numbers.length ; i ++ ) {
            if (i % 2 != 0) {
                sum += numbers[i];
            }
        }

        System.out.println("The sum of odd position numbers is " + sum);

    }
}
