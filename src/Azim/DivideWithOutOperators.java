package Azim;

public class DivideWithOutOperators {

    public static void main(String[] args) {

        System.out.println("divideWithoutOperator(45) = " + divideWithoutOperator(45, 76));


    }


    //Numbers -- Divide without / operator
    //        Write a method that can divide two numbers without using division operator.
    public static String divideWithoutOperator(int dividend, int divisor) {
        int result = 0;

        if (dividend == 0) {
            return String.valueOf(0);
        } else if (divisor == 0) {
            throw new ArithmeticException();
        }

        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }

        if (dividend < 0) {
            for (int i = dividend; i <= -divisor; i += divisor) {
                result++;
            }
            result *= -1;
        }


        return "the result is " + result + " the remainder is " + dividend;
    }
}


