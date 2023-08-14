package sayyad;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAhmed {
    public static void main(String[] args) {

        ArrayList<String> listOfAhmed = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Sayyad","Savay"));

        //Solution 1:
        for (int i = 0; i < listOfAhmed.size(); i++) {
            if (listOfAhmed.get(i).equals("Ahmed")){
                listOfAhmed.remove(i);
            }
        }
        System.out.println(listOfAhmed);

        //Solution 2
        listOfAhmed.removeIf(p -> p.equals("Ahmed"));
        System.out.println(listOfAhmed);



    }
}
/*
    ArrayList - Remove "Ahmed"
    Given a list of people's names: "Ahmed", "John", "Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */