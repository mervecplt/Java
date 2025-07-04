import java.util.Scanner;

public class Main {
    /*
     * Aşağıda verilen serinin hesaplanmasını sağlayan programı fonksiyon kullanarak
     * yazınız
     * 1^2+2^2+3^2+4^2
     */
    public static double seriToplami(double N) {
        double toplam, i;
        toplam = 0;

        for (i = 1; i <= N; i++) {
            toplam = toplam + Math.pow(i, 2);
        }
        return toplam;
    }

    public static void main(String[] args) {
        double n, sonucum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seri hangi degerde bitsin");
        n = scanner.nextDouble();
        sonucum = seriToplami(n);
        System.out.println("Serinin toplami: " + sonucum);
        scanner.close();
    }

}