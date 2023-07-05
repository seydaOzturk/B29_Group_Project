package Seyda;

import java.util.Scanner;

public class PasswordValidation {
    //todo:
    // 1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //1. Password MUST be at least have 6 characters and should not contain space
    //2. PassWord should at least contain one upper-case letter
    //3. PassWord should at least contain one lowercase letter
    //4. Password should at least contain one special character
    //5. Password should at least contain a digit
    //if all requirements above are met, the method returns true, otherwise returns  false
    public static boolean passwordValidation(String password){
        boolean isLengthValid = password.length() >= 6;
        if(password.length() < 6){
            System.out.println("Password must have at least 6 characters");
            return false;
        }
        int upperCase = 0 , lowerCase = 0, digit = 0, specialChar = 0;
        for (int i = 0; i <password.length() ; i++) {
           char ch = password.charAt(i);
           if(Character.isUpperCase(ch)){
               upperCase++;
           }else if(Character.isLowerCase(ch)){
               lowerCase++;
           } else if (Character.isDigit(ch)) {
               digit++;
           }else if(!Character.isDigit(ch) && !Character.isLetter(ch)){
               specialChar++;
           }

        }
        if(isLengthValid && upperCase >= 1 && lowerCase >= 1 && digit >= 1 && specialChar >= 1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String password = input.next();
        System.out.println(passwordValidation(password));

    }
}
