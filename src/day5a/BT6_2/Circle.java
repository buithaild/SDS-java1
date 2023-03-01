package day5a.BT6_2;

public class Circle implements  GeometricObject{
    private  double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + "\t" +
                "chuVi=" + getPerimeter() + "\t" +
                "dienTich=" + getArea() + "\t" +
                '}';
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return radius*2*3.14;
    }
}
