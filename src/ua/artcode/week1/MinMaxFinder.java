package ua.artcode.week1;

import java.util.Scanner;

/**
 * Created by tos on 2/24/16.
 */
public class MinMaxFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int number1 = scanner.nextInt();
        System.out.println("Input second number");
        int number2 = scanner.nextInt();
        System.out.println("Input third number");
        int number3 = scanner.nextInt();
        System.out.println(new MinMaxFinder().findMinMax(number1, number2, number3));

    }

    public String findMinMax(int number1, int number2, int number3){
        int min;
        int max;

        if (number1<number2 && number1<number3 && number2<number3){
             min = number1;
             max = number3;
        }
        else if (number2<number1 && number2<number3 && number1<number3){
             min = number2;
             max = number3;
        }
        else if (number3<number1 && number3<number2 && number1<number2){
             min = number3;
             max = number2;
        }
        else if(number3<number1 && number3<number2 && number2<number1){
             min = number3;
             max = number1;
        }
        else if (number2<number1 && number2<number3 && number3<number1){
             min = number2;
             max = number1;
        }
        else if (number1<number2 && number1<number3 && number3<number2){
             min = number1;
             max = number2;
        }
        else{
            return "There is no min or no max";
        }

        String resultMessage = "Minimum is: " + min + "maximum is:" + max;
        return resultMessage;
    }


}
