package day3b;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        oopExample1 d1 = new oopExample1();
        d1.name = "Cho bull";
        d1.age = 1;
        d1.color = "Xam";


        //phuong thuc
        d1.eat();
        d1.run();

        //Tao 1 doi tuong Dog d2
        //Nhap du lieu tu ban phim
        Scanner in = new Scanner(System.in);
        oopExample1 d2 = new oopExample1();
        System.out.print("Nhap ten: ");
        d2.name = in.nextLine();

        System.out.print("Nhap tuoi: ");
        d2.age = Integer.parseInt(in.nextLine());
        System.out.println("Nhap mau: ");
        d2.color = in.nextLine();

        in.close();
        d2.run();
        d2.eat();

    }
}
