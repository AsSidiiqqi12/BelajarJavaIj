import java.util.Scanner;

public class Apis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk menyimpan harga barang
        double[] hargaBarang = {10.5, 20.3, 15.2, 8.7, 12.0};

        // Menampilkan daftar harga barang
        System.out.println("Daftar Harga Barang:");
        for (int i = 0; i < hargaBarang.length; i++) {
            System.out.println("Barang " + (i + 1) + ": " + hargaBarang[i]);
        }

        // Meminta input jumlah barang untuk setiap item
        int[] jumlahBarang = new int[hargaBarang.length];
        for (int i = 0; i < hargaBarang.length; i++) {
            System.out.print("Masukkan jumlah barang untuk Barang " + (i + 1) + ": ");
            jumlahBarang[i] = scanner.nextInt();
        }

        // Menampilkan inputan barang yang dimasukkan
        System.out.println("\nInputan Barang:");
        for (int i = 0; i < hargaBarang.length; i++) {
            System.out.println("Barang " + (i + 1) + ": Jumlah " + jumlahBarang[i]);
        }

        // Menghitung total belanja
        double totalBelanja = 0;
        for (int i = 0; i < hargaBarang.length; i++) {
            totalBelanja += hargaBarang[i] * jumlahBarang[i];
        }

        // Menampilkan total belanja
        System.out.println("\nTotal belanja: " + totalBelanja);

        // Menutup scanner
        scanner.close();
    }
}
