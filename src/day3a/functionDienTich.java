package day3a;

public class functionDienTich {
    public static double chuVi(double a, double b){
        if(a > 0 && b > 0){
            return 2*(a+b);
        }
        return -1;
    }
    public static void main(String[] args) {
        double chuViHCN;
        chuViHCN = chuVi(4, 6);
        System.out.println("Chu vi hinh chu nhat: " + chuViHCN);

    }
}
