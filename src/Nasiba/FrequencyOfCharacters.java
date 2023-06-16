package Nasiba;

public class FrequencyOfCharacters {

    public static String FrequencyOfChars(String str) {
        String NUM = "";
        for(int i=0; i < str.length(); i++)
            if(!NUM.contains(""+str.charAt(i)))
                NUM+= ""+str.charAt(i);

        String expectedResult = "";
        for( int j=0;j < NUM.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == NUM.charAt(j))
                    count++;
            }
            expectedResult +=NUM.charAt(j)+"" + count;
        }
        return expectedResult;
    }
}
