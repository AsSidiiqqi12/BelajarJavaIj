import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args){
        Scanner input= new Scanner( System.in);
        int alas , tinggi;
        double luas;
        System.out.println(" masukkan alas :  ");
        alas= input.nextInt();
        System.out.println(" masukkan tinggi :  ");
        tinggi= input.nextInt();
        luas= alas * tinggi / 2;
        System.out.println(" luas segitiga adalah " + luas);




    }
}