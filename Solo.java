import  java.util.Scanner;

public class Solo {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int a;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            if (a >= 0 && a < menu.length){
                String selectedDrink = menu[a];
                System.out.println(selectedDrink);
            }else{
                System.out.println("Invalid");
            }
        }else{
            System.out.println("Invalid input. please enter a valid integer.");

        }
        sc.close();
    }

}