import java.util.Scanner;
public class Latihan8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah data : ");
        int jumdata = in.nextInt();
        int []array = new int[jumdata];
        System.out.println("Inputkan data berikut : ");
        for (int a = 0; a < jumdata; a++){
            System.out.print("Data ke- " + a + "; ");
            array[a] = in.nextInt();
        }
        for (int b = 0; b < jumdata ; b++){
            if (array[b] % 2 == 0){
                System.out.println(array[b] + " ---> GENAP");
            }else{
                System.out.println(array[b] + " ---> GANJIL");
            }
        }







    }
}
