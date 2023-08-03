package sayyad;

import java.util.Arrays;

public class ArrayFindMinimum {
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

          System.out.println(FindMinimumArray(arr));

    }


    public static int FindMinimumArray(int[] nums) {
//        Arrays.sort(nums);
//        return nums[0];

        int minimum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minimum) {
                minimum = nums[i];
            }
        }
        return minimum;
    }
}
/*
Array_FindMinimum
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */