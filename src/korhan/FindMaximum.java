package korhan;

public class FindMaximum {
    /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */
    public static int max(int[] array){
        int maxNum=array[0];
        for(int i=1;i<array.length; i++){
            if(array[i]>maxNum){
                maxNum=array[i];
            }

        }
        return maxNum;

    }

    public static void main(String[] args){
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(max(arr));
    }




}
