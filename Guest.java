import static java.lang.System.out;
import java.util.Scanner;
public class Guest {
    public static void main(String args[]) {
        int guests[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
        int roomNum = 0;
        System.out.print("masuk mass ");
        
        out.println("Room\tGuests");
        for (int numGuests : guests) {
            out.print(roomNum++);
            out.print("\t");
            out.println(numGuests);
        }
    }
}