package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/26/16.
 */
public class CheckerEqualsPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();

        if (a == b || a == c || b == c) {

            System.out.println("You have at least one equal pair");
        }
        else {
            System.out.println("All numbers are different");
        }
    }

}
