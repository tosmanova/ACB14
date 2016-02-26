package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/26/16.
 */
public class RaiserToPower3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        int a = scanner.nextInt();
        System.out.println("Input b");
        int b = scanner.nextInt();
        System.out.println("Input c");
        int c = scanner.nextInt();

        int resA, resB, resC;

        if (a <= 0){
            resA = 0;
        }
        else{
            resA = a*a*a;
        }

        if (b <= 0){
            resB = 0;
        }
        else{
            resB = b*b*b;
        }

        if (c <= 0){
            resC = 0;
        }
        else{
            resC = c*c*c;
        }

        System.out.println("The result is: " + resA + " "+ resB + " " + resC);

    }
}
