import java.util.Scanner;

public class Main {
    /*
     * --Tek Boyutlu Sayı Dizisi Egzersizleri
     * 
     * Kullanıcıdan n tane sayı alınız ve bunların ortalamasını bulunuz
     * Girdiğiniz n değerinin 0 ile 100 arasında olmasına dikkat ediniz
     */

    public static void main(String[] args) {
        int n, toplam, i;
        double ortalama;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz: ");
        n = scanner.nextInt();
        while (n >= 100 || n <= 0) {
            System.out.print("Kac tane sayi gireceksiniz: ");
            n = scanner.nextInt();
        }

        int[] dizim = new int[n];
        toplam = 0;

        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayim: ");
            dizim[i] = scanner.nextInt();
            toplam = toplam + dizim[i];
        }
        ortalama = (double) toplam / n;
        System.out.println("Ortalama: " + ortalama);

        scanner.close();
    }

}