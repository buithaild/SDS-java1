package day3a;

import java.util.Scanner;

public class BT117 {
    // Viết chương trình nhập n và tính tổng

    //Ham luy thua
    public static double luyThua (double coSo, int soMu){
        //Tri tuyet doi cua so mu
        int tuyetDoiMu = Math.abs(soMu);
        double ketQua = 1;
        for(int i = 0; i < tuyetDoiMu; i++){
            ketQua *= coSo;
        }
        if(soMu < 0) return 1/ketQua;
        return ketQua;
    }
    public static double tong (double x, int n){
        if(n < 0){
            return -1;
        }
        double tong = 0;
        for(int i = 1; i <= n; i++){
            tong = tong + luyThua(x, i);
        }
        return  tong;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap co so va n:");
        double x = in.nextDouble();
        int n = in.nextInt();
        System.out.println("Tong can tinh la: " + tong(x, n));


    }
}
