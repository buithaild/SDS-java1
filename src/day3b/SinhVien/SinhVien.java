package day3b.SinhVien;

public class SinhVien {
    private  int id;
    private String hoTen;
    private float LT;
    private float TH;
    public  SinhVien(){

    }

    public SinhVien(int id, String hoTen, float LT, float TH) {
        this.id = id;
        this.hoTen = hoTen;
        this.LT = LT;
        this.TH = TH;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getLT() {
        return LT;
    }

    public void setLT(float LT) {
        this.LT = LT;
    }

    public float getTH() {
        return TH;
    }

    public void setTH(float TH) {
        this.TH = TH;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", LT=" + LT +
                ", TH=" + TH +
                '}';
    }

    public double diemTB(){
        return (LT+TH)/2;
    }
}
