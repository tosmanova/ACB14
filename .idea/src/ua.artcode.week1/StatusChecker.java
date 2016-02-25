package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/23/16.
 */
public class StatusChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number between 0 and 24");
        int currentTime = scanner.nextInt();
        System.out.println(new StatusChecker().get(currentTime));
    }

    private String get(int currentTime) {
        if (currentTime >= 9 && currentTime <= 18) {
            return "I am at work";
        } else if (currentTime > 0 && currentTime < 24) {
            return "I have rest";
        } else {
            return "You are wrong, you have to type a number between 0 and 24'";
        }

    }
}