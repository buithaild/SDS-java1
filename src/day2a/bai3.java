package day2a;

import java.util.Scanner;

public class bai3 {
    /*

     */
    public  static void main(String[] args) {
        long n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = in.nextLong();
        in.close();
        if(n < 0){
            System.exit(0);
        }
        double tong = 0;
        for(int i = 1; i <= n; i++){
            tong = tong +  (1.0 / i);
        }
        System.out.printf("Tong = %f", tong);
    }
}
