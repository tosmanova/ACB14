package ua.artcode.HW2;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by tos on 3/2/16.
 */
public class Task4_2 {
    public static void main(String[] args) {

        System.out.println("Input range ");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();

        System.out.println("Input size");
        int size = scanner.nextInt();

        int[] testArray = ArrayUtils.generateArray(size,range);

        System.out.println("You array " + ArrayUtils.convertArrInString(testArray) + " contains minimum " + ArrayUtils.getMinimumNumberOfArray(testArray) + " maximum " + ArrayUtils.getMaximumNumberOfArray(testArray));

        System.out.println("You new array is: " + ArrayUtils.convertArrInString(ArrayUtils.changeMinMaxElements(testArray)));
    }

}
