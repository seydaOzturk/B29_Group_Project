package sayyad;

import java.util.ArrayList;

public class RemoveSomeValues {

    public static ArrayList<Integer> removeValuesOver100(ArrayList<Integer> list){

        list.removeIf(p -> p > 100);
        return list;
    }

}
/*
ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */