import  java.util.Scanner;

public class Watercos {
    public static void main(String[] args) {
        //your code goes here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a >= 100){
            System.out.println("Boiling");
        }else{
            System.out.println("Not boiling");
        }
    }
}