package day4a.keThuaEx2;

public class HinhChuNhat {
    private double chieuDai = 1;
    private  double chieuRong = 1;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(chieuDai > 0 && chieuRong > 0){
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(chieuDai > 0) {
            this.chieuDai = chieuDai;
        }
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong > 0){
            this.chieuRong = chieuRong;
        }
    }

    // Phuong thuc
    public double chuVi(){
        return ((chieuDai+chieuRong)*2);
    }
    public  double dienTich(){
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", chuVi=" + chuVi() +
                ", dienTich=" + dienTich() +
                '}';
    }
}
