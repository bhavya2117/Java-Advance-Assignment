// Q11. Write the output of the following code.

package Ques11;

class Outer {
    void outerMethod() {
        System.out.println("Inside outerMethod");
// Inner class is local to outerMethod()
        class Inner {
            void innerMethod() {
                System.out.println("Inside innerMethod");
            }
        }
        Inner y = new Inner();
        y.innerMethod();
    }
}
class Test1 {
    public static void main(String[] args) {
        Outer x = new Outer();
        x.outerMethod();
    }
}

// Output : Inside outerMethod
//          Inside innerMethod
// When an object of outer class is created and outermethod() of outer class is called then
// "Inside innerMethod" is printed and then object of inner class is made then after the method calling
// of inner class "Inside innerMethod" is printed as an output.
