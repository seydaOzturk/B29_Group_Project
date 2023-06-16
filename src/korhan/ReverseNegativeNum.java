package korhan;

public class ReverseNegativeNum {

    /* Numbers -- Reverse negative number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -38  output: -83 */

    public static void main(String[] args) {
        System.out.println(reverseNeg(-38));
    }

    public static int reverseNeg(int num){
            int reversed=0;
        for(;num!=0; num/=10){
            int digit = num%10;
            reversed = reversed*10+digit;
        }
        return reversed;
    }



}
