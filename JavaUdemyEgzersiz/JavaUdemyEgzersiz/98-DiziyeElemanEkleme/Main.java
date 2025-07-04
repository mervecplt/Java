import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
     * Bilgisayar tarafından rastgele üretilen N adet sayı bir dizide tutulmaktadır.
     * Dizi içerisine dizi sıra numarası belirterek klavyeden alınan bir tamsayının
     * ilgili sıraya eklenmesini sağlayan programı fonksiyon olarak yazınız
     */

    public static void ekle(int[] A, int sirano, int deger, int elemanSayisi) {
        if (sirano <= elemanSayisi + 1) {

            for (int i = elemanSayisi - 1; i >= sirano - 1; i--) {
                A[i + 1] = A[i];
            }
            A[sirano - 1] = deger;
            System.out.println("Dizimizin eleman eklenmis hali:");
            for (int i = 0; i <= elemanSayisi; i++) {
                System.out.print(A[i] + " ");
            }

        } else {
            System.out.println("Gecerli bir sira numarasi giriniz");
        }
    }

    public static void main(String[] args) {
        int n, i, sira, deger;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac adet sayi uretilecek: ");
        n = scanner.nextInt();
        Random random = new Random();

        int[] dizi = new int[n + 1];

        System.out.println("Uretilen dizi elemanlari:");
        for (i = 0; i < n; i++) {
            dizi[i] = random.nextInt(100);
            System.out.println(dizi[i]);
        }
        System.out.print("Hangi siraya eleman eklenecek:");
        sira = scanner.nextInt();

        System.out.print("Eklenecek sayi:");
        deger = scanner.nextInt();

        ekle(dizi, sira, deger, n);

        scanner.close();
    }

}