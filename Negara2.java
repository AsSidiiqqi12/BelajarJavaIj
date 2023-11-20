import java.util.Scanner;
public class Negara2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input kode negara = ");
        String kode = in.nextLine();
        String negara;
        switch (kode){
            case "ES":
                negara ="Spain";
                System.out.println("kode " + kode + "," + "negara " + negara);
                break;
            case "TN":
                negara ="Tunisia";
                System.out.println("kode " + kode + "," + "negara " + negara);
                break;
            case "ID":
                negara ="Indonesia";
                System.out.println("kode " + kode + "," + "negara " + negara);
                break;
            case "MM":
                negara ="Myanmar";
                System.out.println("kode " + kode + "," + "negara " + negara);
                break;
            case "IN":
                negara ="India";
                System.out.println("kode " + kode + "," + "negara " + negara);
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
        }
    }
}
