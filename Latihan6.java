public class Latihan6 {
    public static void main(String[] args) {
        int [] angka = {1,3,5,6,7,8,3};
        int a = 0;
        do{
            if (angka[a] % 2 == 0){
                System.out.println(angka[a] + " GENAP");
            }else{
                System.out.println(angka[a] + " GANJIL");
            }
            a++;
        }while(a < angka.length);


    }
}
