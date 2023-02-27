package day3b.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setGiaXe(1000);
        v1.setDungTich(90);

        System.out.println(v1);
        System.out.println("Thue truoc ba: " + v1.thueTruocBa());
        //---------------------

        Vehicle v2 = new Vehicle("honda", "SH", "Red", 5000, 150);
        System.out.println(v2);
        System.out.println("Thue truoc ba xe 2 la: " + v2.thueTruocBa());
        //-------------

        Vehicle v3 = new Vehicle();
        v3.setGiaXe(10000);
        v3.setDungTich(300);
        System.out.println(v3);
        System.out.println("Thue truoc ba: " + v3.thueTruocBa());

    }
}
