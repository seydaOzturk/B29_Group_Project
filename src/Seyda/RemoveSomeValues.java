package Seyda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {
//    ArrayList - Remove some values
//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,4,123,109,55,345));
    System.out.println(removeSomeValues(nums));
}
    public static List<Integer> removeSomeValues(List<Integer> numbers){
        List<Integer> newNumbers = new ArrayList<>(numbers);
        newNumbers.removeIf(p -> p > 100);
        return newNumbers;
    }
}
