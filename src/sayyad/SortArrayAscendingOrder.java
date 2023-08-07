package sayyad;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayAscendingOrder {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};
        System.out.println(Arrays.toString(ascendingOrder(arr)));


    }


    public static int[] ascendingOrder(int[] nums){

        int minimum = nums[0];
        for (int i = 0; i < nums.length ; i++) {

            if (nums[i] < minimum){
                nums[i] = minimum;
            }
        }
        return nums;



    }
}
/*
Array_SortAscending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
 */