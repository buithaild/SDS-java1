package day3b;


public class mainHCN {
    public  static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {
//        oopHCN h1 = new oopHCN();
//        h1.chieuDai = 5;
//        h1.chieuRong = 4;
//
//
//        //Tao h2
//        oopHCN h2 = new oopHCN(7, 5);
//n
//        //Tinh chu vi, dien tich
//        System.out.println("Dien tich cua h1 la " + h1.dienTich());
//        System.out.println("Chu vi cua h2 la " + h2.chuVi());

        oopHCN[] arr = new oopHCN[10];
        for(int i = 0; i < 10; i++){
            double chieuDai = getRandomNumber(10, 20);
            double chieuRong = getRandomNumber(20, 30);
            arr[i] = new oopHCN(chieuDai, chieuRong);
            System.out.println(arr[i].toString());
        }

        //Tim hinh chu nhat co dien tiich lon nhat

        double dtMax = arr[0].dienTich();

        int vtMax = 0;

        for(int i = 1; i < 10; i++){
            if(dtMax < arr[i].dienTich()){
                vtMax = i;
                dtMax = arr[i].dienTich();
            }
        }
        System.out.println("Hinh chu nhat co dien tich lon nhat: ");
        System.out.println(arr[vtMax].toString());
    }
}
