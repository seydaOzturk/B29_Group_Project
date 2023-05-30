package Java_interview_questions;

import java.util.Scanner;

public class OddAndEven {
    /*
 Write a method that can identify  a given number is even or odd.
EX:
    identify(5) --> "Odd"
    identify(6) --> "Even"
  */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number?");
        int num = input.nextInt();

        System.out.println(oddAndEven(num));

    }

    public static String oddAndEven(int a) {
        return (a % 2 == 0) ? "Even" : "Odd";
    }
}
