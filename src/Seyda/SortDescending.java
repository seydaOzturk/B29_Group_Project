package Seyda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortDescending {
    //todo:
    //Write a method that can sort the ArrayList in Descending order without using the sort method.

    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(Arrays.asList(10,20,7, 8, 90));
        System.out.println(sortDescendingOrder(newList));
    }
    public static List<Integer> sortDescendingOrder(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if(list.get(i) < list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        List<Integer> list2 = new ArrayList<>();
        for (int each: list) {
            list2.add(each);

        }

        return list2;

    }
}
