package day3a;

import java.util.Scanner;

public class tinhChuVi {

    public  static void xuatMang(double[] arr) {
        System.out.println("Mang la: ");
        for (Double d : arr) {
            System.out.print(d + "\t");
        }
        System.out.println();
    }

    public static double chuVi(double r){
        if(r >  0){
            return 2*r*3.14;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = in.nextInt();
//        in.close();

        // Khoi tao mang
        double[] arr = new double[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for(int i = 0; i < n; i++){
            System.out.printf("arr[%d] = \t", i);
            arr[i] = in.nextDouble();
        }
//        System.out.println("Cac phan tu cua mang: ");
//        for (int i = 0; i < n; i++){
//            System.out.printf("arr[%d] = %f", i, arr[i]);
//        }
        xuatMang(arr);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                count++;
            }
        }
        System.out.println();
        System.out.println("So hinh tron hop le la: " + count );

        double tongCacChuVi = 0;
        for (int i = 0; i < n; i++){
            if(arr[i] > 0){
                tongCacChuVi += chuVi(arr[i]);
            }
        }
        System.out.println("Tong cac chu vi la: " + tongCacChuVi);

        double cvMax = chuVi(arr[0]);
        for(int i = 0; i < n; i++){
            if(chuVi(arr[i]) > cvMax){
                cvMax = chuVi(arr[i]);
            }
        }
        System.out.println("Chu vi lon nhat la: " + cvMax);
    }

}
