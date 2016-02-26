package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/26/16.
 */
public class CheckerTriangleType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0) {

            if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
                System.out.println("Triangle is right.");
            } else {
                System.out.println("Triangle isn't right.");
            }
        }
        else {
            System.out.println("You are wrong.");
        }
    }
}

