import java.util.Scanner;

public class Latihan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan panjang array
        System.out.print("Masukkan panjang array: ");
        int length = scanner.nextInt();

        // Membuat array dengan panjang yang dimasukkan pengguna
        int[] numbers = new int[length];

        // Meminta pengguna untuk memasukkan elemen-elemen array
        System.out.println("Masukkan elemen-elemen array:");

        for (int i = 0; i < length; i++) {
            System.out.print("Element ke-" + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Memisahkan angka ganjil dan genap, serta menghitung penjumlahan dan rata-rata
        int sumEven = 0, sumOdd = 0;
        int countEven = 0, countOdd = 0;

        for (int i = 0; i < length; i++) {
            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
                countEven++;
            } else {
                sumOdd += numbers[i];
                countOdd++;
            }
        }

        // Menampilkan hasil
        System.out.println("\nHasil:");
        System.out.println("Angka genap: Jumlah = " + sumEven + ", Rata-rata = " + (double) sumEven / countEven);
        System.out.println("Angka ganjil: Jumlah = " + sumOdd + ", Rata-rata = " + (double) sumOdd / countOdd);

        // Menutup scanner
        scanner.close();
    }
}

