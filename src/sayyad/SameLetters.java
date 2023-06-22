package sayyad;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {

        System.out.println(sameLetters("salal", "masal"));


    }

    public static boolean sameLetters(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

}
/*
String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */