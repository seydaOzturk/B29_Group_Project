package korhan;

public class FrequencyOfCharacters {

    /** String - Frequency of Characters
    Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2 */

    public static void main(String[] args) {
        System.out.println(frequencyOf("AAABBCDD"));
    }
    public static String frequencyOf(String word){
        StringBuilder result= new StringBuilder();
        for(int j=0; j<word.length(); j++){
            int times =0;
            for(int i=1; i< word.length(); i++){
                if(word.charAt(j)==word.charAt(i)){
                    times++;
                }

            }

            if(result.toString().contains(""+word.charAt(j))) {
                continue;
            }

            result.append("").append(word.charAt(j)).append(times);

        }
        return result.toString();
    }
}
