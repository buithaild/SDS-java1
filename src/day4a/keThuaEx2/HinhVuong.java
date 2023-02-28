package day4a.keThuaEx2;

public class HinhVuong extends  HinhChuNhat{
    private double canh = 1;

    public HinhVuong( double canh) {
        super(canh, canh);
        this.canh = canh;
    }

    public void setChieuDai(double canh) {
        super.setChieuDai(canh);
        super.setChieuRong(canh);
    }

    public void setChieuRong(double canh) {
        super.setChieuRong(canh);
        super.setChieuDai(canh);
    }
}
