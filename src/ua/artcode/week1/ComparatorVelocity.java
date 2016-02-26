package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/26/16.
 */
public class ComparatorVelocity {
    public static void main(String[] args) {
        int velocityInKm, velocityInM, velocityInKmChanged;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type velocity in KM/H");
        velocityInKm = scanner.nextInt();

        System.out.println("Type velocity in M/S");
        velocityInM = scanner.nextInt();

        velocityInKmChanged = velocityInKm * 1000 / 3600;

        if (velocityInKmChanged > velocityInM) {
            System.out.println(velocityInKm + " KM/H is bigger then  " + velocityInM + " M/S ");
        } else if (velocityInKmChanged < velocityInM) {
            System.out.println(velocityInKm + " KM/H is smaller then  " + velocityInM + " M/S ");
        } else
            System.out.println("Both velocities are the same.");

    }
}
