package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/24/16.
 */
public class RangeValidator {
    public static void main(String[] args) {
        System.out.println("Input any float");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        if (number<=1 && number>=0)
        {
            System.out.println("Your number is between 0 and 1");
        }
        else{
            System.out.println("Wrong number");
        }
    }
}
