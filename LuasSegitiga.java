import java.util.Scanner;

public class LuasSegitiga{
    public static void main(String[] args){
        Scanner input= new Scanner( System.in);
        int alas , tinggi;
        double luas;
        System.out.print(" masukkan alas   :  ");
        alas= input.nextInt();
        System.out.print(" masukkan tinggi :  ");
        tinggi= input.nextInt();
        luas= alas * tinggi / 2;
        System.out.println(" luas segitiga adalah " + luas);




    }
}