package Seyda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAscending {
    //todo:
    //Array_SortAscending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = sortAscending(arr); ==>{ 7, 8, 9, 10};
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 9, 8, 7));
        System.out.println(sortAscendingOrder(list));
    }
    public static List<Integer> sortAscendingOrder(ArrayList<Integer> arr){

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int each : arr){
            list.add(each);
        }
        return list;
    }
}
