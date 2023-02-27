package day3b.Vehicle;

public class Vehicle {
    //Thuoc tinh
    private String maXe;
    private String tenXe;
    private String mauXe;
    private double giaXe;
    private int dungTich;

    public  Vehicle(){

    }

    //Phuong thuc
    public Vehicle(String maXe, String tenXe, String mauXe, double giaXe, int dungTich) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.mauXe = mauXe;
        this.giaXe = giaXe;
        this.dungTich = dungTich;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "maXe='" + maXe + '\'' +
                ", tenXe='" + tenXe + '\'' +
                ", mauXe='" + mauXe + '\'' +
                ", giaXe=" + giaXe +
                ", dungTich=" + dungTich +
                '}';
    }

    public double thueTruocBa(){
        if(dungTich < 100){
            return giaXe*0.01;
        } else if (dungTich < 200) {
            return giaXe*0.03;
        }
        return giaXe*0.05;

    }
}
