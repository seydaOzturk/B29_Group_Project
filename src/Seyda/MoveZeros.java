package Seyda;

import java.util.Arrays;

public class MoveZeros {
//    Array - Move Zeros to the End
//Write a method that can move all the zeros to last indexes of the array (Do
//Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
//0]

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0};
        System.out.println(moveZeros(arr));
    }
    public static String moveZeros(int[] arr){

        int[] newArr = new int[arr.length];

        int count =0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] != 0){
               newArr[count++] = arr[i];
            }
        }

       return Arrays.toString(newArr);
    }
}
