import java.util.Scanner;
public class Persegi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" masukan sisi persegi!!!");
        int sisi= input.nextInt();
        int luas = sisi * sisi;
        System.out.println("luas persegi adalah " + luas);
        int kel = 4 * sisi;
        System.out.println(" kelilingnya adalah " + kel);

    }

}
