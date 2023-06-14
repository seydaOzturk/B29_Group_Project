package sayyad;

public class IsPrime {
    public static void main(String[] args) {

        isPrime(40);

    }

    /*
  Numbers -- Prime Number
  Write a method that can check if a number is prime or not.
   */
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
