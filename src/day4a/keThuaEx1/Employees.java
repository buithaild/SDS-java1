package day4a.keThuaEx1;

public class Employees {
    private String name;
    private  String address;
    private String  apartment;
    protected double salary;

    public Employees(){

    }

    public Employees(String name, String address, String apartment, double salary) {
        this.name = name;
        this.address = address;
        this.apartment = apartment;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
