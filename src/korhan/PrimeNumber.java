package korhan;

public class PrimeNumber {

    /* Numbers -- Prime Number
    Write a method that can check if a number is prime or not. */

    public static void main(String[] args) {

        checkPrime(61);

    }
    public static void checkPrime(int num){
        String result = "is Prime.";
        for(int i=2; i<num;i++){
            if(num%i==0){
                result = "is not Prime.";
                break;
            }

        }

        System.out.println("The number you have entered "+result);
    }



}
