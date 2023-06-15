package korhan;

public class SwapNumbers {
    /*Numbers -- Swap Numbers
    Swap two variable' values without using a third variable*/

    public static void main(String[] args) {

        int a = 28;
        int b = 39;

        System.out.println("Before Swapping b = " + b +" a= "+a);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping b = " +b+" a= "+a);

    }


}
