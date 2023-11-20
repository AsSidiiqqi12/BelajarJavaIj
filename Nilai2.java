import java.util.Scanner;
public class Nilai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char huruf = in.next().charAt(0);
        double nilai;
        switch (huruf){
            case 'A':
                nilai = 4.0;
                System.out.println("Nilai = " + nilai);
                break;
            case 'B':
                nilai = 3.0;
                System.out.println("Nilai = " + nilai);
                break;
            case 'C':
                nilai = 2.0;
                System.out.println("Nilai = " + nilai);
                break;
            case 'D':
                nilai = 1.0;
                System.out.println("Nilai = " + nilai);
                break;
            case 'E':
                nilai = 0;
                System.out.println("Nilai = " + nilai);
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");

        }
    }
}
