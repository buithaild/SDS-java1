package BaiTap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            KyThuat kt1 = new KyThuat("238","Thái","23/08/1999","Nam Định","Electronic and Telecommunication");
            KyThuat kt2 = new KyThuat("258");
            System.out.print("Nhập tên:");
            kt2.setHoTen(in.nextLine());
            System.out.print("Nhập ngày tháng năm sinh theo dd/mm/yyyy:");
            kt2.setNamSinh(in.nextLine());
            System.out.print("Nhập địa chỉ:");
            kt2.setDiaChi(in.nextLine());
            System.out.print("Nhập chuyên ngành:");
            kt2.setDiaChi(in.nextLine());
            System.out.println(kt1.toString());
            System.out.println(kt2.toString());
    }
}
