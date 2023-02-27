package day3b;

import java.util.Scanner;

public class oopStudent2 {
    public static void main(String[] args) {
        oopStudent s1 = new oopStudent();

        s1.name = "Tuan";
        s1.age = 23;
        s1.color = "white";
        s1.sex = "Male";

        s1.eating("more");
        s1.drinking("little");
        s1.running("fast");

        Scanner in = new Scanner(System.in);
        oopStudent s2 = new oopStudent();
        System.out.println("Nhap ten: ");
        s2.name = in.nextLine();
        System.out.print("Nhap tuoi: ");
        s2.age = Integer.parseInt(in.nextLine());
        System.out.println("Nhap mau: ");
        s2.color = in.nextLine();
        System.out.println("Nhap gioi tinh: ");
        s2.sex = in.nextLine();
        in.close();

        s2.running("fast");
    }
}
