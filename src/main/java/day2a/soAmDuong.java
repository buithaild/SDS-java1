package day2a;

import java.util.Scanner;

public class soAmDuong {
    public static void main(String[] args){
        double x;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so tu ban phim: ");
        x = in.nextDouble();

        if(x < 0) {
            System.out.printf(x + " la so am");
        } else if (x == 0) {
            System.out.println(x + " Khong la so am cung khong la so duong");
        }
        else {
            System.out.printf(x + " la so duong");
        }
    }
}
