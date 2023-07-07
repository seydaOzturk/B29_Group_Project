package korhan;

public class RemoveDublicates {
    /* String - Remove Duplicates
    Write a return method that can remove the duplicated values from the String
    Ex: removeDup("AAABBBCCC") ==> ABC */


    public static void main(String[] args) {

        System.out.println(removeDublicate("AAABBBCCCDDDEX"));

    }

    public static String removeDublicate(String str){
       StringBuilder result= new StringBuilder("" + str.charAt(0));
        for(int i=1; i<str.length(); i++){
            if(result.toString().contains(""+str.charAt(i))){

            }else{
                result.append(str.charAt(i));
            }

        }

        return result.toString();
    }

}
