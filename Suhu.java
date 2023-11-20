import java.util.Scanner;
public class Suhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("temperatur = ");
        int suhu = input.nextInt();
        switch (suhu){
            case 30:
                System.out.println("PANAS");
                break;
            case 24:
                System.out.println("NORMAL");
                break;
            case 20:
                System.out.println("DINGIN");
                break;
            default:
                System.out.println("gak ada perintah dalam tugas nya banggg!!!!!");
        }


    }
}
