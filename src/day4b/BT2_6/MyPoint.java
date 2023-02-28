package day4b.BT2_6;

public class MyPoint {
    private int x = 0; //default x = 0
    private int y = 0; // default y = 0


    //constructor

    //no arg constructor
    public  MyPoint(){
        this (0, 0); // call constructor with 2 parameters
    }

    //constructor with 2 parameters
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] xy = new int[2]; // Declare and initialize 2-element int array
        xy[0] = this.x;
        xy[1] = this.y;
        return xy;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    // Overloaded distance methods
    public double distance(int x, int y) { // Two int parameters
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another) { // One MyPoint parameter
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance() { // No parameters
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
