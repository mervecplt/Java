import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan negatif sayı girinceye kadar sayı almaya devam edin
        // Sayıların toplamını bulup ekrana bastırın

        int toplam = 0;
        int sayi = 0;

        Scanner input = new Scanner(System.in);

        do {
            toplam = toplam + sayi;
            System.out.print("Bir sayi giriniz: ");
            sayi = input.nextInt();
        } while (sayi >= 0);

        System.out.println("Toplam degerim: " + toplam);
        input.close();
    }
}