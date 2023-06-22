package sayyad;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCCJJJL"));

    }

    public static String removeDuplicates(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)){
                result += ch;
            }
        }
        return result;
    }


}




/*
String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */