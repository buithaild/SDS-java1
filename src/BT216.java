import java.util.Random;
import java.util.Scanner;

public class BT216 {
    public static void main(String[] args) {
        //Đếm số lượng số chẵn có trong mảng một chiều các số nguyên
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = in.nextInt();
        in.close();

        int[] arr3 = new int[n];

        //Random cac gia tri cua mang
        System.out.println("Mang: ");
        for (int i = 0 ;  i < n; i++){
            arr3[i] = r.nextInt();
        }

        for(int a: arr3){
            System.out.println(a);
        }

        for(int i = 0; i < n; i++){
            if(arr3[i] % 2 == 0 && arr3[i] != 0) {
                System.out.printf("Phan tu chan cua mang la: arr[%d] = %d", i, arr3[i]  );
            }
        }
    }
}
