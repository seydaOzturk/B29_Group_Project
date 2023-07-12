package Seyda;

import java.util.Scanner;

public class FindMinNum {
    //todo:
    //Write a method that can find the minimum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {

        int[] numbers = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(findMinNum(numbers));

    }



    public static int findMinNum(int[] numbers){
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min){
               min = numbers[i];
            }
        }
        return min;
    }
}
