import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıya bir n değeri girmesini isteyin
     * 1 + 1/2 + 1/3 + 1/n değerini hesaplayın
     */

    public static void main(String[] args) {
        int n, i;
        float sonuc;
        Scanner scanner = new Scanner(System.in);

        sonuc = 0;

        do {
            System.out.print("Lutfen bir sayi giriniz: ");
            n = scanner.nextInt();
        } while (n < 1);

        for (i = 1; i <= n; i++) {
            sonuc += (float) 1 / i;
        }

        System.out.printf("Sonucumuz: %.2f", sonuc);

        scanner.close();
    }

}