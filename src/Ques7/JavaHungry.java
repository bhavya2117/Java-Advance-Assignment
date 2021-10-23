//Q7. Write and explain the output of the following program?

package Ques7;

public class JavaHungry {
    public static void main(String args[])
    {
        try
        {
            int arr[]= {1, 2, 3, 4, 5};
            for (int i = 0; i <= 5; i++)
            {
                System.out.print ("Array elements are : " + arr[i] + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println ("Exception : " + e);
        }
//        catch (ArrayIndexOutOfBoundsException ex)
//        {
//            System.out.println ("ArrayIndexOutOfBoundsException : "+ ex);
//        }
    }
}

// Output: following code has a Compile time error of java: exception java.lang.ArrayIndexOutOfBoundsException has already been caught
// as we have already defined Exception in catch block which will caught any exception if it is there so there
//is no need to define specific exception after that catch block.
