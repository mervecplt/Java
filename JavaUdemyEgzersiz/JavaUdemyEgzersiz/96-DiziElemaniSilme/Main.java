import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
     * Bilgisayar tarafından rastgele üretilen N adet sayı bir dizide tutulmaktadır.
     * Dizi içerisinde istenilen bir değerin dizideki sıra numarası girilerek ilgili
     * sırada bulunan dizi
     * değerinin silinmesini sağlayan programını fonksiyon kullanarak yazınız
     */

    public static void kayitSil(int[] A, int sira, int elemanSayisi) {
        if (sira >= elemanSayisi + 1 || sira <= 0) {
            System.out.println("Gecerli bir sira numarasi giriniz");
        } else {
            for (int i = sira - 1; i < elemanSayisi - 1; i++) {
                A[i] = A[i + 1];
            }

            System.out.println("Elemani sildikten sonra:");
            for (int i = 0; i < elemanSayisi - 1; i++) {
                System.out.print(A[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n, i, sira;
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

        System.out.print("Silinecek sira numarasini giriniz: ");
        sira = scanner.nextInt();

        kayitSil(dizi, sira, n);

        scanner.close();
    }

}