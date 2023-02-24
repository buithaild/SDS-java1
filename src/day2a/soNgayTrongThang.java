package day2a;

import java.util.Scanner;

public class soNgayTrongThang {
    /*
    Nhập vào nă và tháng, kểm tra tháng ó có bao nhiêu ngày?
    In: năm (không âm), tháng (1-12)
    Out: tháng trong ngày
     */
    public  static  void main (String[] args){
        int thang, nam;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so nam va so thang");
        nam = in.nextInt();
        thang = in.nextInt();
        in.close();
        if(nam < 0) {
            System.exit(0);
        }

        switch (thang){
            case 1:
                System.out.printf("Thang %d co 31 ngay", thang);
                break;
            case 2:
                if((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)){
                    System.out.printf("Thang %d co 29 ngay", thang);
                }
                else {
                    System.out.printf("Thang %d co 28 ngay", thang);
                }
                break;
            case 3:
                System.out.printf("Thang %d co 31 ngay", thang);
                break;
            case 4:
                System.out.printf("Thang %d co 30 ngay", thang);
                break;
            case 5:
                System.out.printf("Thang %d co 31 ngay", thang);
                break;
            case 6:
                System.out.printf("Thang %d co 30 ngay", thang);
                break;
            case 7:
                System.out.printf("Thang %d co 31 ngay", thang);
                break;
            case 8:
                System.out.printf("Thang %d co 31 ngay", thang);
                break;
            case 9:
                System.out.printf("Thang %d co 30 ngay", thang);
                break;
            case 10:
                System.out.printf("Thang %d co 31 ngay", thang);
                break;
            case 11:
                System.out.printf("Thang %d co 30 ngay", thang);
                break;
            case 12:
                System.out.printf("Thang %d co 31 ngay", thang);
                break;
        }

    }
}
