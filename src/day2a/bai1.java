package day2a;

import java.util.Scanner;

public class bai1 {
    /*
    Tính S(n) = 1 + 2 + 3 + … + n.
     */
    public  static void main(String[] args){
        long n;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = in.nextLong();
        in.close();
        long tong = 0;
        for(int i = 1; i <= n; i++){
            tong = tong +  i;
        }
        System.out.printf("Tong = %d", tong);
    }
}
