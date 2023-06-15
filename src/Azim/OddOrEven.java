package Azim;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("oddOrEven(34) = " + oddOrEven(34));
    }



    //        Write a method that can identify  a given number is even or odd.
    //       identify(5) --> "Odd"
    //       identify(6) --> "Even"
    public static String oddOrEven(int number) {
        String str = "";
        if (number % 2 == 0) {
            str = "Even number: " + number;
        } else {
            str = "Odd number: " + number;
        }
        return str;
    } // Odd or Even
}
