import java.util.Scanner;

public class gpt {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta nama pengguna
        System.out.print("Masukkan nama Anda: ");
        String namaPengguna = scanner.nextLine();

        // Menampilkan pilihan untuk menghitung luas
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");

        // Meminta pengguna untuk memilih opsi
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int pilihan = scanner.nextInt();

        // Menghitung luas sesuai dengan pilihan
        double luas = 0;
        if (pilihan == 1) {
            // Menghitung luas persegi panjang
            System.out.print("Masukkan panjang: ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = scanner.nextDouble();
            luas = panjang * lebar;
        } else if (pilihan == 2) {
            // Menghitung luas segitiga
            System.out.print("Masukkan alas: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = scanner.nextDouble();
            luas = 0.5 * alas * tinggi;
        } else {
            // Jika pilihan tidak valid
            System.out.println("Pilihan tidak valid. Program berhenti.");
            System.exit(0);
        }

        // Menampilkan nama pengguna dan hasil perhitungan luas
        System.out.println("Halo, " + namaPengguna + "!");
        System.out.println("Luas bangun datar yang dipilih: " + luas);

        // Menutup scanner
        scanner.close();
    }
}
