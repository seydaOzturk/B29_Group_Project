package Seyda;

import java.util.Arrays;

public class SortArrayInAscending {
    //todo:
    //Array_SortAscending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};

        System.out.println(Arrays.toString(sortAscending(arr)));
    }
    public static int[] sortAscending(int[] arr){

        int[] newArray = new int[arr.length];

        int index = -1;

        for(int i= 0; i < arr.length; i++){
            index=i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[index]){
                    index =j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[index];
            arr[index] = temp;
        }
        for (int each : arr){
            newArray = Arrays.copyOf(arr, arr.length);
        }
        return newArray;
    }
}
