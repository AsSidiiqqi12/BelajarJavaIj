import java.util.Scanner;
public class Jago {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] c = {8000, 7000, 7000, 7000, 6000, 6000};
        int[] d = {10000, 10000, 10000, 10000, 11000, 13000};
        String[] a = {"mie ayam", "bakso", "mie yamin", "mie goreng", "nasi goreng", "minas"};
        System.out.print("Pilih makanan : ");
        int menu = input.nextInt();
        String[] o = {"jus pokat", "jus mangga", "jus jeruk", "teh manis", "teh es", "kopi"};
        System.out.print("Pilih minuman : ");
        int g = input.nextInt();
        System.out.println("makanan : " + a[menu]);
        System.out.println("minuman : " + o[g]);
        int harga  = c[g] + d[menu];
        System.out.print("Harga :Rp " +harga+",00");
    }
}
