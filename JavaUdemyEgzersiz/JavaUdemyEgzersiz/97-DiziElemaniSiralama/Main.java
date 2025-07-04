import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
     * Bilgisayar tarafından rastlege üretilen N adet sayı bir dizide
     * tutulmaktadır.Buna göre dizi elemanlarının küçükten büyüğe doğru
     * sıralanmasını sağlayan programını
     * fonksiyon kullanarak yazınız.
     */

    public static void sirala(int[] A, int adet) {
        int i, j, gecici;
        for (i = 0; i < adet - 1; i++) {
            for (j = 0; j < adet - 1 - i; j++) {
                if (A[j] > A[j + 1]) {
                    gecici = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = gecici;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac adet sayi uretilecek: ");
        n = scanner.nextInt();
        Random random = new Random();

        int[] dizi = new int[n];

        System.out.println("Uretilen dizi elemanlari:");
        for (i = 0; i < n; i++) {
            dizi[i] = random.nextInt(100);
            System.out.println(dizi[i]);
        }

        sirala(dizi, n);

        System.out.println("Dizimizin siralanmis hali:");
        for (i = 0; i < n; i++) {
            System.out.print(dizi[i] + " ");
        }

        scanner.close();
    }

}