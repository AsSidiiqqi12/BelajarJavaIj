import java.util.Scanner;
public class Gol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NAMA     : ");
        String nama = input.next();
        System.out.println("Golongan seperti A B C D ");
        System.out.print("GOLONGAN : ");
        String gol = input.next();
        int a = 400000;
        int b = 500000;
        int c = 750000;
        int d = 900000;
        switch (gol){
            case "A":
                double tunA = 0.3 * a;
                double pjA = 0.05 * a + tunA;
                System.out.println("GAJI BERSIH = Rp. " + (a + tunA - pjA) );
            case "B":
                double tunB = 0.3 * b;
                double pjB = 0.05 * b + tunB;
                System.out.println("GAJI BERSIH = Rp. " + (a + tunB - pjB) );
            case "C":
                double tunC = 0.3 * c;
                double pjC = 0.05 * c + tunC;
                System.out.println("GAJI BERSIH = Rp. " + (a + tunC - pjC) );
            case "D":
                double tunD = 0.3 * d;
                double pjD = 0.05 * d + tunD;
                System.out.println("GAJI BERSIH = Rp. " + (a + tunD - pjD) );


        }
    }
}
