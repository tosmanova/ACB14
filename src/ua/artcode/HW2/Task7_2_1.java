package ua.artcode.HW2;

import ua.artcode.HW2.ArrayUtils;
/**
 * Created by tos on 3/1/16.
 */
public class Task7_2_1 {
    public static void main(String[] args) {
        int[] mas = {23,56,66,7980};
        int[] result = new int[4];

        result = ArrayUtils.reverse3(mas);

        for (int i = 0; i <4 ; i++) {
            System.out.println(result[i]);
        }
    }
}
