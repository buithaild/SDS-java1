package BaiTap2;

public abstract class NhanVien {
    private String idNhanVien;
    private String hoTen;
    private String namSinh;
    private  String diaChi;

    public NhanVien() {
    }
    public NhanVien(String idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public NhanVien(String idNhanVien, String hoTen, String namSinh, String diaChi) {
        this.idNhanVien = idNhanVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }



    public String getIdNhanVien() {
        return idNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public abstract String moTaCongVien();

    @Override
    public String toString() {
        return "NhanVien{" +
                "idNhanVien='" + idNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }


}
