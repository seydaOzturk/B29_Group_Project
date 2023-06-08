package Nasiba;

import java.util.Scanner;

public class DivideWithoutOperator {
    /*
  Write a method that can divide two numbers without using division operator.
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double number1 = input.nextDouble();
        System.out.println("Enter the second number");
        double number2 = input.nextDouble();

        System.out.println(divide(number1, number2));

    }
    public static String divide(double dividend, double divisor) {
        // handle divisibility by o ( when divisor == 0)
        if (divisor == 0) {
            System.err.println("Error! Divisor can not be zero");
            System.exit(1);
        }
        // sign for result
        int sign = 1;
        if (dividend < 0) {
            dividend = dividend * -1;
            sign = -sign;
        }
        if (divisor < 0) {
            divisor = divisor * -1;
            sign = -sign;
        }
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return "The quotient is: " + quotient * sign + "The remainder is: " + dividend * sign;

    }
}
