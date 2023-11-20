import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        // Menentukan PIN
        int pin = 1234;

        // Maksimal percobaan
        int maksPercobaan = 3;

        // Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang! Silakan tebak PIN 4 digit.");

        // Loop untuk maksimal percobaan
        for (int percobaan = 1; percobaan <= maksPercobaan; percobaan++) {
            System.out.print("Masukkan tebakan PIN: ");
            int tebakan = scanner.nextInt();

            // Memeriksa apakah tebakan benar
            if (tebakan == pin) {
                System.out.println("Selamat! PIN benar.");
                break; // Keluar dari loop jika PIN benar
            } else {
                System.out.println("PIN salah.");

                // Menampilkan sisa percobaan
                int sisaPercobaan = maksPercobaan - percobaan;
                System.out.println("Sisa percobaan: " + sisaPercobaan);

                // Menampilkan pesan jika masih ada percobaan
                if (sisaPercobaan > 0) {
                    System.out.println("Coba lagi.");
                } else {
                    System.out.println("Maaf, percobaan habis. Silahkan coba beberapa saat lagi ");
                }
            }
        }

        // Menutup scanner
        scanner.close();
    }
}
