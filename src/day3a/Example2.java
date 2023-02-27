package day3a;

public class Example2 {
    // LOAI 1: Khong co tham so, khong co gia tri tra ve
    public static void sayHello(){
        System.out.println("Xin chao, I am IRON");
    }

    //LOAI 2: khong co tham so, co gia tri tra ve

    public  static  double getPI(){
        return  3.14;
    }

    //LOAI 3: co tham so, nhung khong co gia tri tra ve
    public static  void chuViHT(double r) {
        double cv = 2 * 3.14 *r;
        System.out.println("Chu vi: " + cv);
    }

    public static void main(String[] args) {
        sayHello();
        System.out.println();
        sayHello();

        double myPi = getPI();
        System.out.println("Chu vi hinh tron co r = 3 la: " + 2*3*getPI());
        chuViHT(5);
    }
}
