package day5a.BT6_2;

public class Rectangle implements GeometricObject{
    private double width;
    private  double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width + "\t" +
                ", length=" + length + "\t" +
                "chuVi=" + getPerimeter() + "\t" +
                "dienTich=" + getArea() + "\t" +
                '}';
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width + length)*2;
    }
}