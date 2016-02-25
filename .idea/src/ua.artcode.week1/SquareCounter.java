package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/24/16.
 */
public class SquareCounter {
    public static void main(String[] args) {

        System.out.println("Input a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int modulo = number%7;

        if (modulo==0){
            System.out.println(number*number);
        }
        else {
            System.out.println("Wrong number");
        }
    }

}
