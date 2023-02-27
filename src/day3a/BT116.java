package day3a;

import java.util.Scanner;

public class BT116 {
    //Input, Output
    // Neu khong hop le -> output = -1

    public static long tong(int n){
        if(n < 0){
            return -1;
        }

        long t = 0;
        for(int i = 1; i <= n; i ++){
            t = t + i;
        }
        //Luu y khong nen in cac gia tri tra ve
        //System.out.println(t);
        return t;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = in.nextInt();
        System.out.println("Tong la: " + tong(n));

    }
}
