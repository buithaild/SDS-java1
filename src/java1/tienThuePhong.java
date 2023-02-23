package java1;

import java.util.Scanner;

public class tienThuePhong {
    /*
    Viết chương trình tính tiền thuê phòng như sau:
- Giá phòng = giá cố định (theo hợp đồng) + tiền điện + tiền nước + dịch vụ...
- Tiền điện: 4k/1 số
- Tiền nước: 30k/1 khối
- Dich vụ khác: chủ động nhập thêm

Lưu ý: nhập tiền điện tháng trước/ này, số nước trước/này -> tính tự đông
     */
    public  static  void main(String [] args) {
        double soDienTruoc, soDienNay, soNuocTruoc, soNuocNay;
        double GIA_PHONG = 2500000;
        double DICH_VU = 200000;
        double tong;

        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so dien thang truoc va thang nay");
        soDienTruoc = in.nextDouble();
        soDienNay = in.nextDouble();
        System.out.println("Nhap so nuoc thang truoc va thang nay");
        soNuocTruoc = in.nextDouble();
        soNuocNay = in.nextDouble();

        tong = GIA_PHONG + (soDienNay - soDienTruoc) * 4000 + (soNuocNay - soNuocTruoc) * 30000 + DICH_VU;
        System.out.printf("Tien thue nha tat ca la: %f", tong);
    }
}
