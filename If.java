import java.util.Scanner;
public class If {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" masukan nilai anda ");
        int a=input.nextInt();
        if (a <= 55){
            System.out.println(" nilai kamu E ");
        }else if (a <= 65){
            System.out.println(" nilai kamu D ");
        }else if (a <= 75){
            System.out.println(" nilai kamu C ");
        }else if (a <= 85){
            System.out.println(" nilai kamu B ");
        } else if (a <= 100) {
            System.out.println(" nilai kamu A ");
        }else{
            System.out.println(" anak mana kau kok lain nilai mu !!!!!!");

        }




    }
}