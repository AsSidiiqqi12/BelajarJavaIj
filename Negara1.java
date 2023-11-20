import java.util.Scanner;
public class Negara1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input kode negara = ");
        String kode = in.nextLine();
        String negara;
        if (kode.equals("ES")){
            negara = "Spain";
            System.out.println("kode " + kode +"," + " negara " + negara);
        }else if (kode.equals("TN")) {
            negara = "Tunisia";
            System.out.println("kode " + kode +"," + " negara " + negara);
        }else if (kode.equals("ID")) {
            negara = "Indonesia";
            System.out.println("kode " + kode +"," + " negara " + negara);
        }else if (kode.equals("MM")) {
            negara = "Myanmar";
            System.out.println("kode " + kode +"," + " negara " + negara);
        }else if (kode.equals("IN")) {
            negara = "India";
            System.out.println("kode " + kode +"," + " negara " + negara);
        }else{
            System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
        }
    }
        
}
