package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/26/16.
 */
public class SeasonValidator {
    public static void main(String[] args) {
        System.out.println("Input integer from 1 to 12:");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month > 12 && month <= 0) {
            System.out.println("You are wrong");
        } else if (month <= 2 && month >= 1 && month == 12) {
            System.out.println("Winter");
        } else if (month <= 5 && month >= 3) {
            System.out.println("Spring");
        } else if (month <= 8 && month >= 6) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }

    }
}
