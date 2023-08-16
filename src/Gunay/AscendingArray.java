package Gunay;

import java.util.Arrays;

public class AscendingArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAscending(3, 4, 1, 3, 8, 6, -1, 5, 1, 2, 6)));

    }

    public static int[] sortAscending(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

}

