package day4a.BT3;

public class Bao extends TaiLieu{
    private String ngayPhatHanh = "";

    public Bao(String maTL, String NXB, int soLuongXB, String ngayPhatHanh) {
        super(maTL, NXB, soLuongXB);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
}
