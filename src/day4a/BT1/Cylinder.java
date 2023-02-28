package day4a.BT1;

public class Cylinder extends Circle{
    private double height = 1.0;

    public  Cylinder(){

    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return height*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() + "\t" +
                ",color=" + getColor() + "\t" +
                "height=" + height + "\t" +
                "Area=" + getVolume() +
                '}';
    }
}
