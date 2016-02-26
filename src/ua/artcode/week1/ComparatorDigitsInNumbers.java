package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/26/16.
 */
public class ComparatorDigitsInNumbers {
    public static void main(String[] args) {
        int testNumber;
        int firstDigit, secondDigit, thirdDigit;
        System.out.println("Input a number with 3 digits");
        Scanner scanner = new Scanner(System.in);
        testNumber = scanner.nextInt();

        if (testNumber > 999) {
            System.out.println("You number containts more then 3 digits.");
        }

        firstDigit = testNumber / 100;
        secondDigit = testNumber / 10;
        thirdDigit = testNumber % 10;

        if (firstDigit == secondDigit && firstDigit == thirdDigit) {
            System.out.println("All digits are the same.");
        }
        else if (firstDigit == secondDigit || firstDigit == thirdDigit || secondDigit == thirdDigit)
        {
            System.out.println("At least two digits are the same");
        }

    }
}
