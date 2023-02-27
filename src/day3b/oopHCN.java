package day3b;

public class oopHCN {
    double chieuDai;
    double chieuRong;

    //PHUONG THUC KHOI TAO RONG
    public oopHCN(){

    }

    //PHUONG THUC KHOI TAO DAY DU THAM SO
    public  oopHCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public double chuVi(){
        return (chieuDai + chieuRong) * 2;
    }
    public double dienTich (){
        return  chieuDai*chieuRong;
    }

    //Bo sung
    public String toString(){
        return String.format("HinhChuNhat[chieuDai=%.2f, chieuRong=%.2f]", chieuDai, chieuRong);
    }
}
