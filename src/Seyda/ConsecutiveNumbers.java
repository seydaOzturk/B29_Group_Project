package Seyda;

public class ConsecutiveNumbers {
    /*
    Numbers -- print consecutive numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

For example, here is the output for N = 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi1ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
     */
    public static void main(String[] args) {
        System.out.println(consecutiveNumber(25));
    }
    public static String consecutiveNumber(int num){

        String result = "";
            for (int i = 1 ; i <= num ; i++) {
                if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 ) {
                    result += "\n" + i + " ";
                }else if(i % 2 == 0 && i % 3 != 0 && i % 5 != 0){
                    result += "\nCodility";
                }else if(i % 3 == 0 && i % 2 != 0 && i % 5 != 0){
                   result += "\nTest";
                }else if(i % 5 == 0 && i % 2 != 0 && i % 3 != 0){
                   result += "\nCoders";
                }else if(i % 2 == 0 && i % 3 == 0 && i % 5 != 0){
                   result += "\nCodilityTest";
                }else if(i % 2 == 0 && i % 5 ==0 && i % 3 != 0){
                   result += "\nCodilityCoders";
                }else if ( i % 3 == 0 && i % 5 == 0 && i % 2 != 0){
                   result += "\nCodersTest";
            }
        }



        return  result;
    }
}
