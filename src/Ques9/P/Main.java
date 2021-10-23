package Ques9.P;

import Ques9.P1.TwoDim;
import Ques9.P2.ThreeDim;

public class Main {
    public static void main(String[] args) {
        TwoDim obj = new TwoDim(4, 8);
        System.out.println(obj);
        TwoDim obj2 = new ThreeDim(9, 6, 30);
        System.out.println(obj2);
    }
}
