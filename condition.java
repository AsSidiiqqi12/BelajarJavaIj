import  java.util.Scanner;

public class condition{
    public static void main(String[] args) {
        //your code goes here
        Scanner input = new Scanner(System.in);
        String colors = input.nextLine();
        switch (colors){
            case "red":
                System.out.println("1");
                break;
            case "green":
                System.out.println("2");
                break;
            case "black":
                System.out.println("3");
                break;
        }
    }
}