import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan positif sayılar isteyin negatif sayı girilinceye kadar olan
        // sayıların toplamını ekrana bastırınız
        int toplam = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();

        while (sayi >= 0) {
            toplam += sayi;
            System.out.print("Bir sayi giriniz: ");
            sayi = input.nextInt();
        }
        System.out.print("Toplam degerim: " + toplam);

        input.close();

    }
}