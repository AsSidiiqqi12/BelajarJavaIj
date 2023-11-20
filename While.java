import java.util.Scanner;
public class While {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Inisialisasi variabel total
        int total = 0;

        // Mencetak angka dari 1 hingga n dan mengakumulasikannya
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            total += i;
        }

        // Menghitung rata-rata
        double rata2 = (double) total / n;

        // Menampilkan hasil
        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rata2);
        }







    }

