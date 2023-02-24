package day2a;

public class vongLap {
    /*
       Giống nhau: hành động đếm
       TH1: Huu hạn : For
       TH2: Chưa biết chính xác khi nào dừng: while

       JAVA: dùng For, while, do-while


     */

    public  static void main(String[] args){
//        //in cac so tu 0- 100
//        for(int i = 0; i <=100; i++){
//            System.out.println(i);
//        }
        // tinh tong cac so tu 1 den 1000
        long tong = 0;
        for(int i = 1; i <= 1000; i++){
            tong = tong +  i;
        }
        System.out.printf("Tong = %d", tong);
    }
}
