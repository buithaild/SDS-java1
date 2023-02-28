package day4a.keThuaEx2;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(4, 3);
        System.out.println(hcn.toString());

        System.out.println("------------------");

        HinhVuong hv = new HinhVuong(7);
        hv.setChieuDai(7);
        hv.setChieuRong(9);
        System.out.println(hv);
    }
}
