package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/25/16.
 */
public class SmartDevisionFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second fgdfgdfginteger");
        int secondNumber = scanner.nextInt();
        int modulo = firstNumber%secondNumber;
        int result = firstNumber/secondNumber;

        if (modulo!=0)
        {
            System.out.println("Result is: " + false + " Modulo= " + modulo );
        }
        else{
            System.out.println("Result is:" + true );
        }

    }
}
