import java.util.Scanner;
public class Upah {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("lama kerja sehari: ");
        int x = input.nextInt();
        int seminggu = x * 7;
        int gaji = seminggu * 2000;
        int j = seminggu - 48;
        int lembur = (48 * 2000)+(3000 * j);

        if (seminggu > 48){

            System.out.println("lama kerja dalam seminggu " + seminggu + " jam");
            System.out.println("upah kerja = Rp" + lembur );
        }else if (seminggu <= 48){
            System.out.println("lama kerja dalam seminggu " + seminggu + " jam");
            System.out.println("upah kerja = Rp" + gaji);
        }




    }
}
