import java.util.Scanner;
public class Jagoaamiin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Jumlah barang belanja");

        int [] harga = {2500,3000,4000,5000,6000};
        int [] jumlahunit = new int[harga.length];
        for (int a = 0 ; a < harga.length ; a++){
            System.out.print("Jumlah belanja item-" + a + " Rp " + harga[a] + " " );
           jumlahunit[a] = in.nextInt();
        }

        System.out.println("Daftar belanja dan harga:");

        for (int a = 0 ; a < harga.length; a++){
            int harbar = jumlahunit[a] * harga[a];
            System.out.println("Harga barang ke-"+a+", "+harga[a]+", "+ jumlahunit[a] + " item : " + harbar);
        }
        int totalitem = 0;
        for (int a = 0; a < harga.length ; a++){
            totalitem = totalitem + jumlahunit[a];
        }
        int totbel = 0;
        for (int a = 0; a < harga.length ; a++){
            totbel = totbel + (jumlahunit[a] * harga[a]);
        }
        System.out.println("TOTAL ITEM BELANJA: " + totalitem);
        System.out.println("TOTAL BELANJA : Rp " + totbel);

        }

    }
