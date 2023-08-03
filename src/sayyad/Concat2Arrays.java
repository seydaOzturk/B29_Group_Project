package sayyad;

public class Concat2Arrays {

    public static String[] concat2Arrays(String[] arr1, String[] arr2){
        String[] result = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

}
/*
Array - Concat two arrays
Write a return method that can concat two arrays
 */