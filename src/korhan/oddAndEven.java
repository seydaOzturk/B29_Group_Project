package korhan;

import java.util.Scanner;

/*Numbers -- odd & even
        Write a method that can identify  a given number is even or odd.
        EX:
        identify(5) --> "Odd"
        identify(6) --> "Even" */

public class oddAndEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write your number");
        int num = input.nextInt();

        oddOrEven(num);

    }

    public static void oddOrEven(int nums){
        String result;
        if(nums%2==0){
            result="identify("+nums+") --> even";
        } else {
            result="identify("+nums+") --> odd";
        }
        System.out.println(result);
    }


}
