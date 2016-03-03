package ua.artcode.HW2;

import java.util.Scanner;
import ua.artcode.HW2.ArrayUtils;

/**
 * Created by tos on 3/1/16.
 */
public class Task4_1 {
    public static void main(String[] args) {
        System.out.println("Input range ");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        System.out.println("Input size");
        int size = scanner.nextInt();

        int[] testArray = ArrayUtils.generateArray(size,range);

        System.out.println("You array " + ArrayUtils.convertArrInString(testArray) + " contains minimum " + ArrayUtils.getMinimumNumberOfArray(testArray) + " maximum " + ArrayUtils.getMaximumNumberOfArray(testArray));


    }
}
