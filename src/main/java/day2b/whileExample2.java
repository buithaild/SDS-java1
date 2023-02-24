package day2b;

public class whileExample2 {
    //in ra cac so tu 1-100 ngoai tru cac so chia het cho 5
    public static void main(String[] args){
        for(int i = 1; i <= 100; i++){
            if(i % 5 == 0){
                continue;
            }
            System.out.print("\t" + i);
        }
    }
}
