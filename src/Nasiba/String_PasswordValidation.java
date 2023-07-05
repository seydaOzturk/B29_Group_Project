package Nasiba;

public class String_PasswordValidation {
    public static boolean isValidPassword(String password) {
        // Requirement 1: Password length should be at least 6 characters and should not contain spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: Password should contain at least one uppercase letter
        boolean hasUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }

        // Requirement 3: Password should contain at least one lowercase letter
        boolean hasLowercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowercase = true;
                break;
            }
        }
        if (!hasLowercase) {
            return false;
        }

        // Requirement 4: Password should contain at least one special character
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        // Requirement 5: Password should contain at least one digit
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        // All requirements are met
        return true;
    }

    public static void main(String[] args) {
        String password = "Abc123$";
        boolean isValid = isValidPassword(password);
        System.out.println(isValid);  // Output: true
    }
}










