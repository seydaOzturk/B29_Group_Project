package Nasiba;

public class SumOfDigits {
    public static int sumOfDigits(String input) {
        int digitSum = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                digitSum += Character.getNumericValue(c);
            }
        }
        return digitSum;
    }

    public static void main(String[] args) {
        String myString = "12 java 5 apple 3";
        int result = sumOfDigits(myString);
        System.out.println(result);  // Output: 20
    }
}