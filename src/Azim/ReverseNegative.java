package Azim;

public class ReverseNegative {
    public static void main(String[] args) {

        reverseNegative(-87);

    }

    /*
Numbers -- Reverse negative number
Write a return method that can reverse digits of a negative number and return it as int
input: -38  output: -83
 */
    public static int reverseNegative(int number){
        number = -number;
        String digits = number + "";
        String reverse = "";

        for (int i = digits.length() -1; i >= 0; i--) {
            reverse += digits.charAt(i);
            number = Integer.parseInt(reverse);
        }
        return -number;
    }
}
