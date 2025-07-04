import java.util.Scanner;

public class Main {
    /*
     * Kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayılara
     * mükemmel sayı adı verilmektedir.
     * Buna göre klavyeden girilen bir sayının mükemmel olup olmadığını fonksiyon
     * kullanarak bulan programı yazınız
     */

    public static int mukemmel(int n) {
        int i, toplam;

        toplam = 0;

        for (i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam = toplam + i;
            }
        }

        if (toplam == n) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int sayi, sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();
        sonuc = mukemmel(sayi);

        if (sonuc == 1) {
            System.out.println(sayi + " mukemmel sayidir");
        } else {
            System.out.println(sayi + " mukemmel sayi sayidir");
        }
        scanner.close();
    }

}