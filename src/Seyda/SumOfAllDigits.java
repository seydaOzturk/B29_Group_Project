package Seyda;

import java.util.Collections;

public class SumOfAllDigits {
    //todo:
    // Write a method that can return the sum of the digits in a string
    //Ex:  "12 java 5 apple 3"  ==>  20

    public static int sumOfAllDigit(String str){
          int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum += Integer.parseInt(String.valueOf(ch));
            }
        }
     return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfAllDigit("12 java 5 apple 3"));
    }
}
