import java.util.Scanner;

public class Bot {
    public static void bot(){


        Scanner input = new Scanner(System.in);


        int userInput  = input.nextInt();

        if (userInput == 1){
            System.out.println("Order confirmed");
        } else if(userInput == 2) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }

        input.close();
    }
    public static void main(String[] args) {
        bot();
    }

}