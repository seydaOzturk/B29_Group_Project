package sayyad;

public class UniqueCharacters {

    public static void main(String[] args) {

        System.out.println(uniqueCharacters("AAABBBSDEFGG"));

    }
    public static String uniqueCharacters(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                result += ch;
            }
        }
        return result;
    }

}
/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */