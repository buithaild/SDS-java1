package day5a.EX2;

import java.util.Scanner;

public class HinhTron implements HinhHoc{
    private  double banKinh;

    public HinhTron() {
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuVi() {
        return banKinh*2*3.14;
    }

    @Override
    public double tinhDienTich() {
        return banKinh*banKinh*3.14;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }

    @Override
    public void initFromKeyboard(Scanner scanner) {
        System.out.print("Nhập bán kính: ");
        banKinh = Double.parseDouble(scanner.nextLine());
    }
}
