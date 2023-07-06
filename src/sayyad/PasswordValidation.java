package sayyad;

import javax.xml.stream.events.Characters;

public class PasswordValidation {

    public static boolean passwordValidation(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialChar = false;
        boolean digit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCase = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                specialChar = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
            }

        }
        return upperCase && lowerCase && specialChar && digit;

    }

}
/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */