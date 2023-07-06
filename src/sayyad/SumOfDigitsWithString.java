package sayyad;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumOfDigitsWithString {


    public static void main(String[] args) {
        String a = "12 java 5 apple 3";

        System.out.println("sumOfDigits(a) = " + sumOfDigits(a));


    }

    public static int sumOfDigits(String str){
        String[] arr = str.split(" ");
        int sum = 0;

        for (String each : arr) {
            if (Character.isDigit(each.charAt(0))){
                sum += Integer.parseInt(each);
            }
        }
        return sum;

    }

}
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */