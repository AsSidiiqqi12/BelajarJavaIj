import java .util.Scanner;
public class Nilai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf : ");
        char huruf = input.next().charAt(0);
        double konversi = 0;
        if (huruf == 'A'){
            konversi = 4.0;
        }else if (huruf == 'B'){
            konversi = 3.0;
        }else if (huruf == 'C'){
            konversi = 2.0;
        }else if (huruf == 'D'){
            konversi = 1.0;
        }else if (huruf == 'E'){
            konversi = 0;
        }else{
            System.out.println("Maaf, konversi nilai tidak diketahui");
        }
        System.out.println("NIlai = " + konversi);

    }
}
