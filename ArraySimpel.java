import java.util.Scanner;
public class ArraySimpel{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Jumlah Data: ");
        int jumlahdata = in.nextInt();
        int [] data = new int[jumlahdata];
        System.out.println("Inputkan data berikut:");
        for (int a = 0; a < jumlahdata ; a++){
            System.out.print("Data ke-" + a + ": ");
            data[a] = in.nextInt();
        }
        System.out.println("Menampilkan data");
        for (int a = 0; a < jumlahdata ; a++){
            if (data[a] % 2 == 0){
                System.out.println(data[a] + " -> GENAP");
            }else{
                System.out.println(data[a] + " -> GANJIL");
            }
        }
        int totaljumlah = 0;
        for (int a = 0; a < jumlahdata ; a++){
            totaljumlah = totaljumlah + data[a];
        }
        double ratarata = totaljumlah / jumlahdata;
        System.out.println("TOTAL PENJUMLAHAN: " + totaljumlah);
        System.out.println("RATA-RATA: " + ratarata);
    }
}