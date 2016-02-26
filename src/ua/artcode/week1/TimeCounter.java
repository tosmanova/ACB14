package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/26/16.
 */
public class TimeCounter {
    public static void main(String[] args) {
        System.out.println("Type a velosity");
        Scanner scanner = new Scanner(System.in);
        int velocity = scanner.nextInt();
        System.out.println("Type a distance");
        int distance = scanner.nextInt();

        System.out.println("You time will be: " + distance/velocity );
    }
}
