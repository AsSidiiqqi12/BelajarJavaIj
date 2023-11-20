import java.util.Scanner;

public class DeretBilanganGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        System.out.println("Deret bilangan ganjil " + n + " adalah ");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");


        }


    }

}




