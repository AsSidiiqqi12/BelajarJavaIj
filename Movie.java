import java.util.Scanner;

public class Movie {

    public static void main(String[] args) {
        int[][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        //your code goes here
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 0 && a < seats.length && b >= 0 && b < seats[a].length){
            if (seats[a][b] == 0){
                System.out.println("Free");
            } else {
                System.out.println("Sold");
            }
        }else{
            System.out.println("Invalid seat selection");
        }

        sc.close();

    }

}