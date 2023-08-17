package Seyda;

import java.util.Arrays;

public class SortArrayInDescending {
    //todo:
    //Array_SortDescending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = sortDecending(arr); ==> {90, 20, 10, 8, 7}

    public static void main(String[] args) {
        int[] arr = {10,20,7, 8, 90};

        System.out.println(Arrays.toString(sortDescending(arr)));

    }

    public static int[] sortDescending(int[] arr){

        int[] newArr = new int[arr.length];
               int index = -1;

                for(int i= 0; i < arr.length; i++){
                    index=i;
                    for (int j = i; j < arr.length; j++) {
                        if (arr[j] > arr[index]){
                            index =j;
                        }
                    }
                   int temp = arr[i];
                    arr[i]= arr[index];
                    arr[index] = temp;
                }
                for (int each : arr){
                    newArr = Arrays.copyOf(arr, arr.length);
                }
     return newArr;
    }
}
