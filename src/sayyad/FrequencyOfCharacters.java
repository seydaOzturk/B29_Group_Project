package sayyad;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));

    }

    public static String frequencyOfCharacters(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch1 == ch2){
                    count++;
                }
            }
            if (result.contains(""+ ch1)){
                continue;
            }
            result += ch1;
            result += count;
        }
        return result;
    }


}
/*
String - Frequency of Characters
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */