package Nasiba;

public class RemoveDuplicates {
    /*
     * Write a method that will remove all dupplicates from string
     * removeDup("abcc"); -> "abc"
     */
    public static String removeDup(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i) + ""))
                unique += str.charAt(i);
        }

        return unique;
    }
}
