package Seyda;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveString {
    //ArrayList - Remove "Ahmed"
    //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    //Write a java operation to remove all the names named Ahmed

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeString(names));
    }

    public static ArrayList<String> removeString(ArrayList<String> arr){

       ArrayList<String> newArr = new ArrayList<>(arr);
             newArr.removeIf( p -> p.equalsIgnoreCase("ahmed"));
             return newArr;
    }




}
