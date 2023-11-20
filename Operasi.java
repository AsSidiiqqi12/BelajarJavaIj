import java.util.*;
public class Operasi {
    public static void main(String[] args) {
        System.out.print("masukkan huruf : ");
        Scanner in = new Scanner(System.in);
        char huruf = in.next().charAt(0);
        double index;
        if (huruf == 'A'){
            index = 4.0;
            System.out.print(index);
        }else if (huruf == 'B'){
            index = 3.0;
        }else if (huruf == 'C') {
            index = 2.0;
        }else if (huruf == 'D'){
            index = 1.0;
        }else if (huruf == 'E'){
            index = 0.0;
        }else {
            System.out.println("BUKAN MAHASISWA UIN SUSKA RIAU ");
            return;
        }
        System.out.print(index);







    }
}
