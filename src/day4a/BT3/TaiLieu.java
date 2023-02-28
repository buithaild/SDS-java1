package day4a.BT3;

public class TaiLieu {
    private  String maTL = " ";
    private  String NXB = " ";
    private int soLuongXB = 50;

    public TaiLieu(){

    }
    public TaiLieu(String maTL, String NXB, int soLuongXB) {
        this.maTL = maTL;
        this.NXB = NXB;
        this.soLuongXB = soLuongXB;
    }

    public String getMaTL() {
        return maTL;
    }

    public void setMaTL(String maTL) {
        this.maTL = maTL;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public int getSoLuongXB() {
        return soLuongXB;
    }

    public void setSoLuongXB(int soLuongXB) {
        this.soLuongXB = soLuongXB;
    }
}
