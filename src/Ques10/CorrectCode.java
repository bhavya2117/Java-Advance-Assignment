
//Q10. Is the below code written correctly? If not then give reason.

package Ques10;

class A
{
    String s = "AAA";

    void methodA()
    {
        System.out.println(s);
    }

    static class B
    {
        void methodB()
        {
 //           methodA();
        }
    }
}

// Answer: No, this code is not written correctly as there is one error on line no 18.
// Explanation: Non-static method 'methodA()' cannot be referenced from a static context.
// To make this code correct we have to make the methodA() static.
