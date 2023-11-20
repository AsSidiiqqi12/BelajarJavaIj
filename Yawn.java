import java.util.Scanner;
import static java.lang.System.out;
public class Yawn {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int count = 1; count <= a; count++) {
            out.print("The value of count is ");
            out.print(count);
            out.println(".");
        }
        out.println("Done!");
    }
}