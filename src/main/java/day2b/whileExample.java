package day2b;

import java.util.Scanner;

public class whileExample {
    public static void main(String [] args){
        /*
        Viet mot chuong trinh xac thuc tai khoan
        Mac dinh: admin, admin
        Nguoi dung se duoc nhap toi da 3 lan
        Neu nhap thanh cong -> in ra "chao mung"
        That bai -> in ra "user hoac pass khong dung"
        khi viet het 3 luot => "dang nhap that bai" -> thoat ctrinh


        CV lap lai la gi? khi nao ket thuc
        Lap lai: Nhap du lieu, kiem tra
        Dung khi: khi user va password trung hoac het 3 luot
        */
        String taiKhoan, matKhau;
        boolean isLoginSuceed = false;

        Scanner in = new Scanner(System.in);
        int count = 0;
        while (count < 3){
            //Tang bien dem len 1 don vi
            count++;
            //Nhap user, pass
            System.out.println("Hay nhap tai khoan cua ban: ");
            taiKhoan = in.nextLine();
            System.out.println("Hay nhap mat khau cua ban: ");
            matKhau = in.nextLine();

            //Kiem tra xem co hop le hay khong

            if(taiKhoan.equals("admin") && matKhau.equals("admin")){
                System.out.println("Chao mung!");
                isLoginSuceed = true;

                //Thoat khoi vong lap
                break;
            }
        }
        if(!isLoginSuceed){
            System.out.println("Dang nhap that bai");
        }

        in.close();
    }
}
/*
NOTE:
#break: thoat khoi vong lap
#exit: thoat khoi chuong trinh
 */