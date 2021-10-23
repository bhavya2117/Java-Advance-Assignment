//Q8. WAP to handle the exception using try and multiple catch blocks.

package Ques8;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[10];
            arr[11] = 25 / 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: "+e);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }
}
