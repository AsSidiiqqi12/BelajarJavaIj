import java.util.Scanner;
public class Jago{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("nilai modal ");
        int modal = in.nextInt();
        System.out.print("persen keuntungan ");
        int untung = in.nextInt();
        double profit = modal + (modal * untung);
        System.out.println("modal " + modal);
        System.out.println("persen keuntungan " + untung);
        System.out.println("profit " + profit);
    }
}