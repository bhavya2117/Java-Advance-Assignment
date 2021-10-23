package Ques13;

public class CubeThread extends Thread{
    int number;
    public CubeThread(int randomInteger) {
        number = randomInteger;
    }

    public void run() {
        System.out.println("Cube of " + number + " = " + number * number * number);
    }
}
