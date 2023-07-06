package korhan;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
//    Write a return  method that can find the unique characters from the String
//    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
    public static String uniqueChar(String str){

        String result="";
        for (int i = 0; i < str.length(); i++) {
            int count =0;
            for (int j = 1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count==1||count==0){
                result +=str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String [] args){

        System.out.println(uniqueChar("AAABBBCCCDEF"));
    }



}
