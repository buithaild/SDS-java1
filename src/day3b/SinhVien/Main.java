package day3b.SinhVien;

public class Main {
    public static void main(String[] args) {
        SinhVien s1 = new SinhVien();
        s1.setLT(7);
        s1.setTH(8);
        System.out.println(s1);
        System.out.println("Diem trung binh: " + s1.diemTB());

        //-------------
        SinhVien s2 = new SinhVien(234, "Thai", 7, 9);
        System.out.println(s2);
        System.out.println("Diem trung binh: " + s2.diemTB());
    }
}
