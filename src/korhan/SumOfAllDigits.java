package korhan;


import java.util.HashMap;
import java.util.Set;

import static java.lang.Character.isDigit;

public class SumOfAllDigits {
    //Write a method that can return the sum of the digits in a string
    //Ex:  "12 java 5 apple 3"  ==>  20

    public static int sumOf(String str){
        int value=0;
        String digits="0";

        for(int i=0; i<str.length(); i++){
            if(isDigit(str.charAt(i))){
                digits +=str.charAt(i);

            } else {
                value +=Integer.parseInt(digits);
                digits="0";
            }


        }
        value+=Integer.parseInt(digits);

        return value;
    }

    public static void main(String[] args){
       int a = sumOf("12 java 5 apple 3");
        System.out.println(a);
    }



}
