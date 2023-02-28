package day4b.BT2_6;

public class Main {
    public static void main(String[] args) {

        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint();                  // Test constructor
        System.out.println(p1);                      // Test toString()
        p1.setX(8);                                  // Test setter for x
        p1.setY(6);                                  // Test setter for y
        System.out.println("x is: " + p1.getX());    // Test getter for x
        System.out.println("y is: " + p1.getY());    // Test getter for y
        p1.setXY(3, 0);                        // Test setXY()
        System.out.println(p1.getXY()[0]);           // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);        // Test another constructor
        System.out.println(p2);                      // Test toString()
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));         // Overloaded distance() with MyPoint parameter
        System.out.println(p2.distance(p1));         // Overloaded distance() with MyPoint parameter
        System.out.println(p1.distance(5, 6)); // Overloaded distance() with x, y parameters
        System.out.println(p1.distance());           // Overloaded distance() with no parameters

    }
}
