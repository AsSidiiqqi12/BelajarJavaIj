import java.util.Scanner;
public class Diqqi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai 1 : ");
        double a = in.nextDouble();
        System.out.print("masukkan nilai 2 : ");
        double b = in.nextDouble();
        System.out.print("masukkan nilai 3 : ");
        double c = in.nextDouble();
        double ratarata = (a + b + c) / 3;
        System.out.println("rata rata anda adalah = " + ratarata);
    }
}
