package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/24/16.
 */
public class SumDifferenceFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second integer");
        int secondNumber = scanner.nextInt();
        if (firstNumber <= secondNumber)
        {
            System.out.println("First number - second number: " + (secondNumber - firstNumber));
        }
        else{
            System.out.println("Sum is: " + (firstNumber + secondNumber));
        }
    }

}
