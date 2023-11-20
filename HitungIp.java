public class HitungIp {
    public static void main(String[] args) {
        int sksPF = 4;
        int sksKalkulus = 3;
        int sksSisdig = 2;
        double nilaiIndexPF = 3.5;
        double nilaiIndexKalkulus = 4.0;
        double nilaiIndexSisdig = 2.75;
        double totalindex = (sksPF * nilaiIndexPF) + (sksKalkulus * nilaiIndexKalkulus) + (sksSisdig * nilaiIndexSisdig);
        int totalsks = sksPF + sksKalkulus + sksSisdig;
        double ip = totalindex / totalsks;
        System.out.println("Ip kamu adalah: " + ip);

    }
}
