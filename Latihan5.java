
public class Latihan5 {
    public static void main(String[] args) {
        int [] angka = {1,3,5,6,7,8,3};
        int a = 0;
        while(a < angka.length){
            if (angka[a] % 2 == 0){
                System.out.println(angka[a] + " adalah GENAP ");
            }else{
                System.out.println(angka[a] + " adalah GANJIL ");

            }
            a++;
        }

    }
}
