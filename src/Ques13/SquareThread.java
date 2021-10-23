package Ques13;

public class SquareThread extends Thread{
    int number;
    public SquareThread(int randomInteger) {
        number=randomInteger;
    }
    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}
