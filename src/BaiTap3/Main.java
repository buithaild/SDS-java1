package BaiTap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VanBan vb = new VanBan();
        do {
            System.out.println("--- MENU ----");
            System.out.println("1. Nhập văn bản");
            System.out.println("2. Đếm số chữ trong văn bản");
            System.out.println("3. Chuẩn hóa van bản");
            System.out.println("4. Viết hoa toàn bộ");
            System.out.println("5. Viết thường toàn bộ");
            System.out.println("6. Viết hoa chữ cái đầu tiên");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");
            int inputOption = Integer.parseInt(in.nextLine());
            switch (inputOption){
                case 1:
                    vb.nhapVanban(in);
                    break;
                case 2:
                    System.out.print("Số chữ của văn bản: ");
                    System.out.println(vb.countWords(vb.getChuoiVanBan()));
                    break;
                case 3:
                    vb.standard(vb.getChuoiVanBan());
                    System.out.println("Chuẩn hóa");
                    System.out.println(vb.standard(vb.getChuoiVanBan()));
                    break;
                case 4:
                    System.out.println("Viết hoa toàn bộ");
                    System.out.println(vb.upperCase(vb.getChuoiVanBan()));
                    break;
                case 5:
                    System.out.println("Viết thường toàn bộ");
                    System.out.println(vb.lowerCase(vb.getChuoiVanBan()));
                    break;
                case 6:
                    System.out.println("Viết hoa chữ cái đầu tiên");
                    System.out.println(vb.upperFirstChar(vb.getChuoiVanBan()));
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
