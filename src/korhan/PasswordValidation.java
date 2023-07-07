package korhan;
import java.lang.Character;
public class PasswordValidation {
    /*
        1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space

    2. PassWord should at least contain one upper-case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special character
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false */

    public static Boolean passwordVal(String password){
        Boolean result=true;

        //1. Password MUST be at least have 6 characters and should not contain space
        if(password.length()>=6 || !password.contains(" ")){
            //    5. Password should at least contain a digit
            int count=0;
            for(int i=0; i<=9; i++){
                String str= Integer.toString(i);

                if(password.contains(str)){
                    count++;
                }


            }
            if(count==0){
                result=false;
                //break;
            }
            // 4. Password should at least contain one special character
            if (!(password.contains("@") || password.contains("#")
                    || password.contains("!") || password.contains("~")
                    || password.contains("$") || password.contains("%")
                    || password.contains("^") || password.contains("&")
                    || password.contains("*") || password.contains("(")
                    || password.contains(")") || password.contains("-")
                    || password.contains("+") || password.contains("/")
                    || password.contains(":") || password.contains(".")
                    || password.contains(", ") || password.contains("<")
                    || password.contains(">") || password.contains("?")
                    || password.contains("|"))) {
                result = false;
            }




            // 2. PassWord should at least contain one upper-case letter
            count=0;
            for(int i=65; i<=90; i++){

                char c = (char)i;

                if(password.contains(Character.toString(c))){
                    count++;
                }



            }
            if(count==0){
                result = false;
                //break;
            }

            // 3. PassWord should at least contain one lowercase letter
            count=0;
            for(int i=90; i<=122; i++){
                char c = (char)i;

                if(password.contains(Character.toString(c))){
                    count++;
                }

            }
            if(count==0){
                result=false;
                //break;
            }








        }else{
            result = false;
        }
        return result;

    }

    public static void main(String[] args){
        System.out.println(passwordVal("asd1/Bc"));
    }




}
