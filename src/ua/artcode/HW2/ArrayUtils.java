package ua.artcode.HW2;

/**
 * Created by tos on 2/29/16.
 */
public class ArrayUtils {
    public boolean firstLast6(int[] nums) {
        int lastElement = nums[nums.length - 1];
        int firstElemnt = nums[0];

        boolean result = (lastElement == 6 || firstElemnt == 6);

        return result;
    }

    public boolean sameFirstLast(int[] nums) {

        boolean result = (nums.length >= 1 && nums[0] == nums[nums.length - 1]);

        return result;
    }

    public int[] makePi() {
        int[] Pi = {3,1,4};

        return Pi;
    }

    public boolean commonEnd(int[] a, int[] b) {
        boolean result = (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);

        return result;
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for(int i=0; i<(nums.length ) ; i++){
            sum = sum + nums[i];
        }
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        int firstElement = nums[0];
        for (int i = 0; i<nums.length - 1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1]=firstElement;
        return nums;
    }

    public static int[] reverse3(int[] nums) {
        int[] reversNums = new int[nums.length ];
        for(int i =0; i<nums.length;i++){
            reversNums[i] = nums[nums.length - 1 - i];
        }
        return reversNums;
    }

    public int[] maxEnd3(int[] nums) {
        int maxElement = (nums[nums.length - 1] <= nums[0])?nums[0]:nums[nums.length - 1];
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = maxElement;
        }
        return nums;
    }
    public int sum2(int[] nums) {
        int result = 0;
        if(nums.length ==0){
            result =0;
        }
        else{
            result = ((nums.length)<=1)?nums[0]:(nums[0] + nums[1]);
        }
        return result;

    }

    public static int[] generateArray(int size, int range){
        int[] mas = new int[size] ;
        for (int i = 0; i < mas.length; i++) {
            int randomNum = getRandomNumber(range);
            mas[i] = randomNum ;
        }
        return mas;
    }

    private static int getRandomNumber(int range) {
        return (int)(Math.random() * range);
    }

    public static int getMinimumNumberOfArray(int[] nums){
        int minElement = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            minElement = (nums[i]<=minElement?nums[i]:minElement);
        }
        return minElement;
    }

    public static int getMaximumNumberOfArray(int[] nums){
        int maxElement = nums[0];
        for (int i = 0; i <nums.length-1; i++) {
            maxElement = (nums[i]>=maxElement?nums[i]:maxElement);
        }
        return maxElement;
    }

    public static String convertArrInString(int[] mas){
        String newString = new String();
        for (int i = 0; i < mas.length; i++) {
            newString = newString + mas[i] + " ";
        }
        return newString;
    }

    public static int[] changeMinMaxElements(int[] nums){

        /*1. find min/max elements
         *2. change them in loop (min and max could be more then 1)
         *3. return array
         */
        int maxElement = nums[0];
        int minElement = nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            maxElement = (nums[i]>=maxElement?nums[i]:maxElement);
            minElement = (nums[i]<=minElement?nums[i]:minElement);
        }

        for (int i = 0; i < nums.length-1 ; i++) {
            if(nums[i] == minElement){
                nums[i] = maxElement;
            }
            else if (nums[i] == maxElement){
                nums[i] = minElement;
            }
        }
        return nums;
    }


}
