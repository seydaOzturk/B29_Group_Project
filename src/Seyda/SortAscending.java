package Seyda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAscending {
    //todo:
    //Write a method that can sort the ArrayList in Ascending order without using the sort method.
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
