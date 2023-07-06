package Nasiba;

//Write a method that can find the maximum number from an int Array
//Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
public class Array_FindMaximum {
    public static void main(String[] args) {
        int [] arr ={99, 12, 23, 32, 44, 57, 6};
        System.out.println(maxNum(arr));
    }
    public static int maxNum(int[] arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;

            }

        }
        return max;
    }
}
