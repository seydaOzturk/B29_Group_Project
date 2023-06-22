package Seyda;

public class SameLetters {
    //String - Same letters
    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false
    public static boolean sameLetter(String str1, String str2){
        String s = str1 + "" + str2;

        for (int i = 0; i < s.length(); i++) {

            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                return true;

            }
        }
        return false;
    }


}
