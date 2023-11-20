import java.util.Scanner;
public class LuasLingkaran {
    public static void main(String[] args) {
                Scanner masuk = new Scanner(System.in);
                int jarijari;
                System.out.print(" jari-jari lingkaran = ");
                jarijari = masuk.nextInt();
                double phi;
                phi = 3.14;
                double llingkaran;
                llingkaran = phi * jarijari * jarijari;
                System.out.println(" luas lingkaran tsb adalah      = " + llingkaran);

                double klingkaran;
                klingkaran = 2 * phi * jarijari;
                System.out.println(" keliling lingkaran tsb adalah  = " + klingkaran);


                }


            }




