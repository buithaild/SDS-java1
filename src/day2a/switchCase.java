package day2a;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        long x;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so tu ban phim: ");
        x = in.nextLong();
        in.close();

        switch ((int) x){
            case 0:
                System.out.println("Khong am, khong duong");
                break;
                default:
                    if(x> 0){
                        System.out.println(x + " la so duong");
                    }
                    else {
                        System.out.println(x + " la so am");
                    }
                    break;
        }
    }
}
