package BaiTap2;

public class KyThuat extends NhanVien{

    private String chuyenNganh;

    public KyThuat() {
    }

    @Override
    public String moTaCongVien() {
        return chuyenNganh;
    }
    public KyThuat(String idNhanVien){
        super(idNhanVien);
    }

    public KyThuat(String idNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(idNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }



    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "Kythuat[" + super.toString() +"chuyenNganh='" + chuyenNganh + "\t" +
                ']';
    }
}
