package day4a.BT3;

public class Sach extends TaiLieu{
    private String nameTacGia = " ";
    private  int soTrang = 1;
    private double gia = 1.0;


    public Sach(String maTL, String NXB, int soLuongXB, String nameTacGia, int soTrang, double gia) {
        super(maTL, NXB, soLuongXB);
        this.nameTacGia = nameTacGia;
        this.soTrang = soTrang;
        this.gia = gia;
    }

    public String getNameTacGia() {
        return nameTacGia;
    }

    public void setNameTacGia(String nameTacGia) {
        this.nameTacGia = nameTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
}
