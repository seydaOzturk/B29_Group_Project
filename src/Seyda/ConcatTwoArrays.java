package Seyda;

import java.util.Arrays;

public class ConcatTwoArrays {
//Array - Concat two arrays
//Write a return method that can concate two arrays

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {5,6,7,8 };
        System.out.println(concatTwoArrays(array1, array2));

    }
     public static String concatTwoArrays(int[] arr1, int[]arr2){

         int[] newArr = new int[arr1.length + arr2.length];
          int count =0;
         for (int i = 0; i < arr1.length; i++) {
             newArr[count++] = arr1[i];
         }
         for (int j = 0; j < arr2.length; j++) {
             newArr[count++] = arr2[j];
         }
         return Arrays.toString(newArr);
     }

}
