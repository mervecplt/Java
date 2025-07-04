import java.util.Scanner;

public class Main {
    // Belirli bir aralıktaki tek ve çift sayıların toplamını bulan recursive
    // function yazınız

    public static void hesapla(int start, int end, int[] toplamlar) {
        if (start > end) {
            return;
        }
        if (start % 2 == 0) {
            toplamlar[1] = toplamlar[1] + start;
        } else {
            toplamlar[0] = toplamlar[0] + start;
        }

        hesapla(start + 1, end, toplamlar);
    }

    public static void main(String[] args) {
        int baslangic, bitis;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Baslangic degerini giriniz: ");
        baslangic = scanner.nextInt();

        System.out.print("Bitis degerini giriniz: ");
        bitis = scanner.nextInt();

        int[] toplamlar = { 0, 0 };

        hesapla(baslangic, bitis, toplamlar);

        System.out.println("Tek degerlerin toplami: " + toplamlar[0]);
        System.out.println("Cift degerlerin toplami: " + toplamlar[1]);

        scanner.close();
    }

}