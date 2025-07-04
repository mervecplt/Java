import java.util.Scanner;

public class Main {
    /*
     * Armstrong Sayılar
     * Girilen 3 Basamaklı Sayının Armstrong Sayı Olup Olmadığını Bulunuz
     * Armstrong number is a number that is equal to the sum of cubes of its digits.
     * For example 153, 370, 371 and 407 are the Armstrong numbers.
     * 
     */

    public static void main(String[] args) {
        int sayi, kalan, sonuc, originalNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();
        originalNumber = sayi;

        sonuc = 0;

        while (sayi != 0) {
            kalan = sayi % 10;
            sonuc = sonuc + kalan * kalan * kalan;
            sayi = sayi / 10;
        }

        if (originalNumber == sonuc) {
            System.out.println(originalNumber + " Armstrong sayidir");
        } else {
            System.out.println(originalNumber + " Armstrong sayi degildir");

        }

        scanner.close();
    }

}