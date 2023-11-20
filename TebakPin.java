import java.util.Scanner;
public class TebakPin{
    public static void main(String[] args) {
        int pin = 1234;
        int maksitem = 3;
        for (int a = 1; a <= maksitem ; a++){
            Scanner in = new Scanner(System.in);
            System.out.print("Masukkan pin anda: ");
            int tebak = in.nextInt();
            if (tebak == pin){  
                System.out.println("Selamat pin benar!!!");
    
            }else{
                System.out.println("pin salah");
                int sisa = maksitem - a;
                System.out.println("sisa percobaan= " + sisa);
                if (sisa > 0){
                    System.out.println("Coba lagi");
                }else{
                    System.out.println("Maaf percobaan habis, cobalah 4 jam lagi");
                } 
            }
        }

    }
}