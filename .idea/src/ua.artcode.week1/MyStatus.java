package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/23/16.
 */
public class MyStatus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentTime = scanner.nextInt();
        System.out.println(new MyStatus().get(currentTime));
    }

    private String get(int currentTime) {
        if (currentTime >= 9 && currentTime <= 18) {
            return "I am at work";
        } else if (currentTime > 0 && currentTime < 24) {
            return "I have rest";
        } else {
            return "You are wrong, type a number between 0 and 24'";
        }
    }
}