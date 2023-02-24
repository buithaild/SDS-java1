package day2a;

import java.util.Scanner;

public class bai2 {
    public  static void main(String[] args) {
        long n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = in.nextLong();
        in.close();
        if(n < 0){
            System.exit(0);
        }
        long tong = 0;
        for(int i = 1; i <= n; i++){
            tong = tong +  i*i;
        }
        System.out.printf("Tong = %d", tong);
    }
}
