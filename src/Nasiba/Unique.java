package Nasiba;

public class Unique {
    public static String findUniqueChars(String str) {
        StringBuilder uniqueChars = new StringBuilder();
        str = str.toLowerCase(); // Convert the string to lowercase
        for (int i = 0; i < str.length(); i++) {
            char currentChar = Character.toLowerCase(str.charAt(i)); // Convert the current character to lowercase
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                uniqueChars.append(currentChar);
            }
        }
        return uniqueChars.toString();
    }

    public static void main(String[] args) {
        String inputString = "AAABBBCCCDEF";
        String uniqueCharacters = findUniqueChars(inputString);
        System.out.println(uniqueCharacters);  // Output: def
    }
}

