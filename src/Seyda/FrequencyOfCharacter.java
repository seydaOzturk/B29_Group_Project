package Seyda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyOfCharacter {
    //String - Frequency of Characters
    //Write a return method that can find the frequency of characters
    //  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
    public static String frequencyOfChars(String str){
        String freq = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char letter = str.charAt(i); // A

            if (freq.contains("" + letter)) {
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                char eachLetter = str.charAt(j); //

                if (letter == eachLetter) {
                    count++;
                }

            }

            freq += letter + "" + count;

        }
        return freq;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }
}
