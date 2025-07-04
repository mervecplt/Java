import java.util.Scanner;

public class Main {

    /*
     * Bir çiftlikte tavşanların sayısı 1042 iken, kuşların sayısı 2272'dir.
     * Bir yılda tavşanlar %3.8 oranında çoğalırken, kuşlar %1.2 oranında
     * çoğalmaktadır.
     * Tavşanların kuşların sayısını kaç yıl sonra geçeceğini bulan programı
     * yazınız.
     * 
     */
    public static void main(String[] args) {

        final double tavhiz = 0.038;
        final double kushiz = 0.012;
        double tavsan = 1042;
        double kus = 2272;
        int yil = 0;

        while (tavsan < kus) {
            tavsan = tavsan + tavsan * tavhiz;
            kus = kus + kus * kushiz;
            yil++;
            System.out.printf("%d. yil: tavsan=%.0f kus=%.0f", yil, tavsan, kus);
            System.out.println();
        }

        System.out.println("Tavsanlar kuslari " + yil + " yil sonra gecer");

        // Scanner scanner = new Scanner(System.in);

        // scanner.close();
    }

}