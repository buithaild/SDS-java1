package day5a.BT6_2;

public class Main {
    public static void main(String[] args) {
        GeometricObject[] gs = new GeometricObject[2];
        gs[0] = new Circle(3.2);
        gs[1] = new Rectangle(6, 8);

        System.out.println(gs[0]);
        System.out.println(gs[1]);
    }

}
