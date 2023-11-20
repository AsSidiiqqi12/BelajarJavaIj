import java.util.Scanner;
public class Bootcamp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int N = input.nextInt();
        int A = 0;
        for (int I = 1;I<=N;I++){
            System.out.print(I + " ");
            A += I;

        }
        System.out.println("\ntotal = " + A);
        double rata = (double)  A/N;
        System.out.println("rata-rata: " +  rata);
        }





    }

