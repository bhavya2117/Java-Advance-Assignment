package Ques9.P1;

public class TwoDim {
    private int x,y;

    public TwoDim(){
        this.x=0;
        this.y=0;
        System.out.println("This is a default Constructor");
    }

    public TwoDim(int x, int y){
        this.x=x;
        this.y=y;
    }

    public String toString() {
        return "Coordinate: x = " + x + " y = " + y;
    }
}
