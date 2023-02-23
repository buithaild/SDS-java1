package java1;

import java.util.Scanner;

public class hinhChuNhat {
    public static void main(String[] args) {
        double chieuDai, chieuRong;
        double chuVi, dienTich;

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap chieu dai va chieu rong: ");
        chieuDai = in.nextDouble();
        chieuRong = in.nextDouble();

        chuVi = (chieuDai + chieuRong) * 2;
        dienTich = chieuDai * chieuRong;
        System.out.printf("Hinh chu nhat co chu vi la %f va dien tich la %f.", chuVi, dienTich);
    }
}
