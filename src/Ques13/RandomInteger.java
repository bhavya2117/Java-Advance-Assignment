package Ques13;

import java.util.Random;

public class RandomInteger extends Thread {
    public void run() {
        Random randomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInteger =randomNumber.nextInt(100);
            if (randomInteger%2==0){
                SquareThread squareThread= new SquareThread(randomInteger);
                squareThread.start();
            }else {
                CubeThread cubeThread =new CubeThread(randomInteger);
                cubeThread.start();
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }

}
