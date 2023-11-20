import java.util.Scanner;
import java.util.Arrays;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] angka = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(angka));
        System.out.print("Pilih data ");
        int pilih = in.nextInt();
        if (angka[pilih] % 2 == 0){
            System.out.println(angka[pilih] + " adalah genap");
        }else{
            System.out.println(angka[pilih] + " adalah ganjil");
        }

    }
}
