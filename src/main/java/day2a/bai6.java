package day2a;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = in.nextInt();
        in.close();
        if (n < 0) {
            System.exit(0);
        }
        double tong = 0;
        for (int i = n; i >1; i--) {
            tong = Math.sqrt(i + tong);
        }
        System.out.printf("Tong = %f", tong);
    }
}
