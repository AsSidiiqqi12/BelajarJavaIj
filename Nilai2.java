import java.util.Scanner;
public class Nilai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf = ");
        char huruf = in.next().charAt(0);
        double nilai;
        switch (huruf){
            case 'A':
                nilai = 4.0;
                System.out.println("Nilai = " + nilai);
            case 'B':
                nilai = 3.0;
                System.out.println("Nilai = " + nilai);
            case 'C':
                nilai = 2.0;
                System.out.println("Nilai = " + nilai);
            case 'D':
                nilai = 1.0;
                System.out.println("Nilai = " + nilai);
            case 'E':
                nilai = 0;
                System.out.println("Nilai = " + nilai);
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                System.out.println(huruf);
        }
    }
}
