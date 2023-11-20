import  java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = a * 15 / 100;
        System.out.println(b);
    }
}