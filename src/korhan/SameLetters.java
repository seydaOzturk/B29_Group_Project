package korhan;

import java.util.Scanner;

public class SameLetters {
    /* String - Same letters
    Write a return method that checks if a string is built out of the same letters as another string.
    Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write your first word");
        String word1 = scan.nextLine();
        System.out.println("Please write your second word");
        String word2 = scan.nextLine();

        System.out.println(sameLetters(word1,word2));
    }

    public static boolean sameLetters(String word1, String word2){
        boolean result=false;

        for(int i=0; i<word1.length();i++){
            int times=0;
            for (int j=0; j<word2.length();j++){
                if (word1.charAt(i)==word2.charAt(j)){
                    times++;
                }
            }
            if (times==1){
                result = true;
            }else {
                result=false;
                break;
            }

        }
        return result;

    }




}
