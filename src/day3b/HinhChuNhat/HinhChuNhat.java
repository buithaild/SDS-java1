package day3b.HinhChuNhat;

public class HinhChuNhat {
    private  double chieuDai = 1;
    private  double chieuRong = 1;

    // ALT + INSERT => GET
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        //Thuc te: nem ra exception
        if(chieuDai <= 0){
            System.out.println("Canh phai la so duong");
            System.out.println("Chieu dai hien tai: " + this.chieuDai);
            return;
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong <= 0){
            System.out.println("Canh phai la so duong");
            System.out.println("Chieu dai hien tai: " + this.chieuRong);
            return;
        }
        this.chieuRong = chieuRong;
    }

    public double chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    public double dienTich(){
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi=" + chuVi() +
                ", dienTich=" + dienTich() +

                '}';
    }

    //
//    public String toString(){
//        return String.format("Hinh chu nhat co: chieu dai = %.2f, chieu rong = %.2f, chu vi = %.2f, dien tich = %.2f", chieuDai, chieuRong, chuVi(), dienTich());
//
//    }

}
