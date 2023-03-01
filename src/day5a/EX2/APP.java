package day5a.EX2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APP {
            /*
        --- MENU HINH HOC ---
        1. Thêm hình học (tối đa 100 hình)
        2. In ra tất cả các hình
        3. In ra hình có diện tích lớn nhất
        4. In ra hình có diện tích bé nhất
        5. Sắp xếp theo chu vi tăng dần
        0. Thoát
         */

    // Bước 1: Tạo menu
    // Bước 2: Nhập lựa chọn
    // Bước 3: Xử lý với các lựa chọn tương ứng
    // + Hợp lệ -> tính toán, thưc hiện....
    // + Không hợp lệ -> thông báo nhập lại
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<HinhHoc> hinhHocList = new ArrayList<>();
        do{
            //Menu
            System.out.println("1. Them hinh hoc");
            System.out.println("2. In ra tat ca cac hinh");
            System.out.println("3. In ra hinh co dien tich lon nhat");
            System.out.println("4. In ra hinh co dien tich be nhat");
            System.out.println("5. Sap xep theo chu vi");
            System.out.println("0. thoat");


            System.out.println("Vui long nhap lua chon: ");
            int option = Integer.parseInt((in.nextLine()));
            if(option < 0 || option > 5){
                System.out.println("Lua chon khong hop le");
                continue;
            }

            switch (option){
                case 1:
                    System.out.println("\tBạn muốn nhập hình gì?");
                    System.out.println("1. Hình tròn");
                    System.out.println("2. Hình vuông");
                    System.out.println("3. Hình chữ nhật");

                    int inputOption = Integer.parseInt(in.nextLine());
                    HinhHoc h = null;
                    switch (inputOption){
                        case 1:
                            h = new HinhTron();
                            break;
                        case 2:
                            h = new HinhVuong();
                            break;
                        case 3:
                            h = new HinhChuNhat();
                            break;
                        default:
                            System.out.println("Không hợp lệ");
                            break;
                    }
                    h.initFromKeyboard(in);
                    hinhHocList.add(h);
                    break;

                case 2:
                    for (int i = 0; i < hinhHocList.size(); i++) {
                        System.out.println(hinhHocList.get(i));
                    }
                    break;
                case 3:
                    break;
                case  4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình");
                    in.close();
                    System.exit(0);
                    break;

            }
        }
        while (true);
    }
}
