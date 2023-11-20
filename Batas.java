import java.util.Scanner;

public class Batas {
    public static void main(String[] args) {
        String pin = "1234";
        int maksimalbatas = 3;
        int batas = 0;

        Scanner scanner = new Scanner(System.in);
        while (batas < maksimalbatas) {
            System.out.print("Masukkan PIN 4 digit: ");
            String inputPin = scanner.nextLine();

            if (inputPin.equals(pin)) {
                System.out.println("PIN yang Anda masukkan benar. Akses diberikan.");
                break;
            } else {
                batas++;
                System.out.println("PIN yang Anda masukkan salah. Sisa percobaan: " + (maksimalbatas-batas));
            }
        }

        if (batas >= maksimalbatas) {
            System.out.println("Anda telah melebihi batas maksimal percobaan. Akses ditolak.");
        }
    }
}