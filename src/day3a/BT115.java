package day3a;

import java.util.Scanner;

public class BT115 {
    /*
    Viết chương trình nhập họ tên, điểm toán, điểm văn của một học sinh.
Tính điểm trung bình và xuất kết quả.
     */
    public  static double diemTB (double toan, double van){
        if(toan > 0 && van > 0){
            return (toan + van)/2;
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ho va ten sv: ");
        String hoTen = in.nextLine();
        System.out.println("Nhap diem toan va diem van: ");
        double toan = in.nextDouble();
        double van = in.nextDouble();

        System.out.println("Thong tin sinh vien: ");
        System.out.printf("Ho va ten: %s\t Diem toan: %f\t Diem van: %f\t Diem trung binh: %f", hoTen, toan, van, diemTB(toan, van));
    }
}
