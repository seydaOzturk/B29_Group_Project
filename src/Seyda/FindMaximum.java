package Seyda;

public class FindMaximum {
    //todo:
    // Write a method that can find the maximum number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
    public static int maxNumber(int[] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 36, 789 };
       // System.out.println(maxNumber(new int[]{1, 4, 36, 789}));
        System.out.println(maxNumber(arr));
    }
}
