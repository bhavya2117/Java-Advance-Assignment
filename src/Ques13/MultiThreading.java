//Q13. Write a Java program that implements a multi-thread application that has three threads. First thread generates a random integer every 1 second and if the value is even, the second thread computes the square of the number and prints. If the value is odd, the third thread will print the value of the cube of the number.

package Ques13;

public class MultiThreading {
    public static void main(String[] args) {
        RandomInteger obj = new RandomInteger();
        obj.start();
    }
}
