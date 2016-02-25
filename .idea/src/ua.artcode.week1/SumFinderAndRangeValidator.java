package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/25/16.
 */
public class SumFinderAndRangeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second integer");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        if (sum<=11 && sum>=19)
        {
            System.out.println("Sum is:" + sum);
        }
        else{
            System.out.println("Sum isn't in range [11,19]");
        }
    }
}
