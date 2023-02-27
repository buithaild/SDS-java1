//package day3a;
//
//import java.util.Scanner;
//
//public class BT105 {
//    /*
//    Viết chương trình nhập một số nguyên có hai chữ số. Hãy in ra cách
//    đọc của số nguyên này.
//     */
//    public static String soSangChu(int n){
//        String[] so = {"Khong", "Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam", "Chin"};
//        if(n < 0 || n > 99){
//            return "Khong the thuc hien.";
//        }
//        if(n < 10){
//            return so[n];
//        }
//
//        //Con lai la lon hon 10-> 99
//        //Xac dinh chuc va don vi
//        int chuc = n/10;
//        int donVi = n%10;
//
//        //Hàng chục
//        String tmp = "";
//        if(chuc == 1){
//            tmp = "Mười";
//            if(donVi == 1){
//                tmp += " một";
//            }
//            else if(donVi == 5){
//                tmp += " lăm";
//            }
//            else {
//                tmp += so[donVi];
//            }
//        }
//        else {
//            tmp = tmp + so[chuc] + "mươi";
//            if
//        }
//
//
//
//
//    }
//    public static void main(String[] args) {
//
//
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Nhap n = ");
//        int n = in.nextInt();
//
//        if(n >= 0 && n < 10){
//            System.out.println(so[n]);
//        }
//        if(n == 10) {
//            System.out.println("Muoi");
//        }
//        if(n > 10 && n < 20){
//            int a = n/10;
//            int b = n%10;
//            System.out.println("Muoi" + );
//        }
//    }
//}
