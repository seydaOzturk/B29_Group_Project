package sayyad;

import java.util.Arrays;

public class MaximumNumber {

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};


        System.out.println(max(arr));


    }

    public static int max(int[] arr){
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }


}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */