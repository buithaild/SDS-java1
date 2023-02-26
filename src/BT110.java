public class BT110 {
    public static void main(String[] args) {
        //Cần có tổng 200.000đ từ 3 loại giấy bạc 1000đ, 2000đ, và 5000đ. Lập
        //chương tình để tìm tất cả các phương án có thể.
        int a, b,c ;
        int count = 0;
        for(a = 0; a <= 200; a++){
            for(b = 0; b <= 100; b++){
                for(c = 0; c <= 40; c++){
                    if(a*2000 + b*2000 + c*5000 == 200000){
//                        System.out.println("So to 1000 la " + a + "; so to 2000 la " + b + "; so to 5000 la " + c);
                        count++;
                    }
                }
            }
        }
        System.out.println("Co so phuong an la: " + count);
    }
}
