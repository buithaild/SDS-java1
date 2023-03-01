package BaiTap3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class VanBan {
    private String chuoiVanBan = "";

    public VanBan() {
    }

    public VanBan(String chuoiVanBan) {
        this.chuoiVanBan = chuoiVanBan;
    }

    public String getChuoiVanBan() {
        return chuoiVanBan;
    }

    public void setChuoiVanBan(String chuoiVanBan) {
        this.chuoiVanBan = chuoiVanBan;
    }

    public int countWords(String chuoiVanBan) {
        StringTokenizer stringTokenizer =new StringTokenizer(chuoiVanBan);
        int countWords = stringTokenizer.countTokens();
        return countWords;
    }

    public String standard (String chuoiVanBan){
        chuoiVanBan.trim();
        chuoiVanBan.replace("  "," ");
        return chuoiVanBan;
    }

    public String upperCase (String chuoiVanBan){
        return chuoiVanBan.toUpperCase();
    }
    public String lowerCase (String chuoiVanBan){
        return chuoiVanBan.toLowerCase();
    }

    public String upperFirstChar (String chuoiVanBan){
        String chucaidau = chuoiVanBan.substring(0,1);
        String remainingLetters = chuoiVanBan.substring(1, chuoiVanBan.length());
        chucaidau = chucaidau.toUpperCase();
        chuoiVanBan = chucaidau +remainingLetters;
        return chuoiVanBan;
    }

    @Override
    public String toString() {
        return "Van ban sau khi sua doi[ " +  chuoiVanBan + " ]";
    }
    public void nhapVanban(Scanner scanner) {
        System.out.print("Van ban: ");
        chuoiVanBan = scanner.nextLine();
    }
}
