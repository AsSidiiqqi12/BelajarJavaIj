import static java.lang.System.out;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
public class Room {
public static void main(String args[])
throws IOException {
int guests[] = new int[10];
int roomNum;
Scanner diskScanner =
    new Scanner(new File("GuestList.txt"));
        for (roomNum = 1; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }
        diskScanner.close();
        roomNum = 1;
        while (roomNum < 10 && guests[roomNum] != 0) {
            roomNum++;
        }
        if (roomNum == 10) {
            out.println("Sorry, no vacancy");
        } else {
            out.print("How many people for room ");
            out.print(roomNum);
            out.print("? ");
            Scanner keyboard = new Scanner(System.in);
            guests[roomNum] = keyboard.nextInt();
            keyboard.close();
            PrintStream listOut =
            new PrintStream("GuestList.txt");
            for (roomNum = 0; roomNum < 10; roomNum++) {
                listOut.print(guests[roomNum]);

                listOut.print(" ");
            }
            listOut.close();
        }
    }
}