import java.util.Scanner;
public class Faktorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int N = input.nextInt();
        int A = 1;
        for (int I=1;I<=N;I++){
            A *= I;
        }
        System.out.println(N+"!"+" = "+A);

    }
}