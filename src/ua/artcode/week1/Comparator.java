package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/26/16.
 */
public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second integer");
        int secondNumber = scanner.nextInt();

        int modulo1 = firstNumber % 10;
        int modulo2 = secondNumber % 10;

        if (modulo1 == modulo2) {
            System.out.println(true);
        } else

            System.out.println(false);

    }


}
