package sayyad;

public class SwapNumbers {


    /*Numbers -- Swap Numbers
   Swap two variable values without using a third variable
    */
    public static void main(String[] args) {
        int a = 31;
        int b = 29;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
}
