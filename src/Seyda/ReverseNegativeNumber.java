package Seyda;

public class ReverseNegativeNumber {
    /*
    Numbers -- Reverse negative number
    Write a return method that can reverse digits of a negative number and return it as int
    input: -38  output: -83
     */
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-38));
    }
    public static int reverseNegativeNumber(int num){
       num = num * -1;// -38 * -1 = 38
       int reverse = 0;
       while(num >= 1){
            int lastDigit = num % 10;// 38 % 10  == 8 , 3 % 10 == 3
            reverse = reverse * 10 + lastDigit;// 0 * 10 + 8 ==8, 8*10 + 3== 83
            num = num / 10;// 38 / 10 == 3,
        }
        return  reverse * -1;
    }
}
