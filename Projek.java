import java.util.Scanner;
public class Projek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        String nama = in.nextLine();
        System.out.println("1. LUAS SEGITIGA");
        System.out.println("2. LUAS PERSEGI PANJANG");
        System.out.print("Pllih nomor rumus : ");
        int a = in.nextInt();
        if (a == 1 ){
            System.out.print("Alas = ");
            int alas = in.nextInt();
            System.out.print("Tinggi = ");
            int tinggi = in.nextInt();
            double total = alas * tinggi * 0.5;
            System.out.println("HALO " + nama + "Luas segitiga adalah = " + total);
        }else if (a == 2 ){
            System.out.print("Panjang = ");
            int panjang = in.nextInt();
            System.out.print("Lebar = ");
            int lebar = in.nextInt();
            double totalP = panjang * lebar;
            System.out.println("HALO " + nama + " Luas persegi panjang adalah = " + totalP);
        }



    }
}
