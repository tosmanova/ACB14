package ua.artcode.HW2;

/**
 * Created by tos on 3/3/16.
 */
public class Array2 {

    public static int countEvens(int[] nums) {
        int numberEvents = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 == 0){
                numberEvents = numberEvents +1;
            }
        }
        return numberEvents;
    }

    public int bigDiff(int[] nums) {
        int maxElement = nums[0];
        int minElement = nums[0];
        int bigDiff = 0;
            for (int i = 0; i < nums.length; i++) {
                maxElement = (nums[i]>=maxElement?nums[i]:maxElement);
                minElement = (nums[i]<=minElement?nums[i]:minElement);
            }
       return bigDiff = maxElement-minElement;
    }

}
