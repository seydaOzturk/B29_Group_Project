package Nasiba;

public class Reverse {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str.toLowerCase()); // Convert the string to lowercase
        reversed.reverse();
        return reversed.toString();
    }

    public static void main(String[] args) {
        String inputString = "ABCD";
        String reversedString = reverse(inputString);
        System.out.println(reversedString);  // Output: dcba
    }
}
