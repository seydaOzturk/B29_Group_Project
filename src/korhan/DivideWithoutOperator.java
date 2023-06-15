package korhan;

public class DivideWithoutOperator {
    /* Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator. */

    public static void main(String[] args) {
        int number1=20;
        int number2=5;
        int a=0;
        while(number1 >= number2){
            number1 -=number2;
            a++;
        }
        number1=20;

        System.out.println( number1+"/"+number2+"="+a);
    }
}
