import java.util.Scanner;
public class Barang{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] hargaitem = {2500,3000,4000,5000,6000};
        int [] itemke = new int[hargaitem.length];
        System.out.println("Input jumlah barang belanja ");
        for (int a = 0; a < hargaitem.length ; a++){
            System.out.print("Jumlah belanja item-" + a + " Rp " + hargaitem[a] + ": ");
            itemke[a] = in.nextInt();
        }
        System.out.println("Daftar belanja dan harga:");

        for (int a = 0; a < hargaitem.length ; a++){
             int hargabarang = hargaitem[a] * itemke[a];
            System.out.println("Harga barang ke-" + a + ", " + hargaitem[a] + ", " + itemke[a] + " item: " + hargabarang );
        }
        int item = 0;
        for (int a = 0; a < hargaitem.length; a++){
            item = item + itemke[a];
        }
        int totbelanja = 0;
        for (int a = 0; a < hargaitem.length; a++){
            totbelanja = hargaitem[a] * itemke[a] + totbelanja;
        }
        System.out.println("TOTAL ITEM BELANJA: " + item);
        System.out.println("TOTAL BELANJA: RP " + totbelanja);
    }
}