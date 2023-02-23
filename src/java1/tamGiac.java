package java1;

import java.util.Scanner;

public class tamGiac {
//    Nhập vào 3 số a, b, c từ bàn phím, Hỏi a, b, c có phải 3 cạnh của tam giác hay ko?
//    Nếu có hãy tính chu vi và diện tích.
    public static void main(String[] args) {
        double a, b, c;
        double chuVi, dienTich;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ba canh cua tam giac: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if( (a + b) <= c || (a + c) <= b || (b + c) <= a){
            System.out.println("Ba canh khong hop le");
            System.exit(0);
        }
        else {
            System.out.println("Ba canh co tao thanh mot tam giac");
            chuVi = a + b + c;
            double p = chuVi/2;
            dienTich = Math.sqrt(p * (p-a) * (p-b) * (p-c));
            System.out.printf("Chu vi cua tam giac la %f. Dien tich cua tam giac la %f", chuVi, dienTich);
        }

    }
}
