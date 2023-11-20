import java.util.Scanner;
import java.util.Arrays;
public class Tugas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] a = {"ayam" , "ikan" , "bebek","hiu" ,"cicak"};

        System.out.println(Arrays.toString(a));
        System.out.print("Pilih : ");
        int b = in.nextInt();

        System.out.println(a[b]);
        if (b == 0){
            System.out.println("Ayam merupakan hewan herbivora bertelur yang sering dijadikan lauk pangan");
        }else if(b == 1){
            System.out.println("Ikan adalah anggota vertebrata poikilotermik (berdarah dingin) yang hidup di air dan bernapas dengan insang. Ikan merupakan kelompok vertebrata yang paling beraneka ragam dengan jumlah spesies lebih dari 27,000 di seluruh dunia");
        }else if(b == 2){
            System.out.println("Bebek adalah salah satu spesies burung yang umum dan mudah sekali untuk ditemukan. Hewan tersebut juga sering disebut sebagai waterfowl atau unggas air karena mereka hidup di daerah yang memiliki sungai");
        }else if(b == 3){
            System.out.println("Hiu atau cucut (superordo Selachimorpha) adalah sekelompok ikan dengan kerangka tulang rawan yang lengkap. dan tubuh yang ramping. Mereka bernapas dengan menggunakan lima liang insang (kadang-kadang enam atau tujuh, tergantung pada spesiesnya) di samping, atau dimulai sedikit di belakang, kepalanya. Hiu mempunyai tubuh yang dilapisi kulit dermal denticles untuk melindungi kulit mereka dari kerusakan, dari parasit, dan untuk menambah dinamika air. Mereka mempunyai beberapa deret gigi yang dapat digantikan.");
        }else{
            System.out.println("Cecak atau cicak adalah hewan reptil yang biasa merayap di dinding atau pohon. Cecak berwarna abu-abu, akan tetapi ada pula yang berwarna coklat kehitam-hitaman. Cecak biasanya berukuran sekitar 10 centimeter. Cecak dapat ditemukan di semua benua, kecuali Antarktika. Cecak bersama dengan tokek dan sebangsanya tergolong ke dalam suku Gekkonidae.");
        }




    }
}
