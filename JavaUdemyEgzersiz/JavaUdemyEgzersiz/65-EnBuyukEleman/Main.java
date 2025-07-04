import java.util.Scanner;

public class Main {
    /*
     * --Tek Boyutlu Sayı Dizisi Egzersizleri
     * 
     * Kullanıcıdan n tane sayı alınız ve bu en sayıdan en büyük elemanı bulunuz
     * Girdiğiniz n değerinin 0 ile 100 arasında olmasına dikkat ediniz
     */

    public static void main(String[] args) {
        int n, i, enBuyuk;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz: ");
        n = scanner.nextInt();
        while (n >= 100 || n <= 0) {
            System.out.print("Kac tane sayi gireceksiniz: ");
            n = scanner.nextInt();
        }

        int[] dizim = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayim: ");
            dizim[i] = scanner.nextInt();
        }

        enBuyuk = dizim[0];
        for (i = 1; i < n; i++) {
            if (dizim[i] > enBuyuk) {
                enBuyuk = dizim[i];
            }
        }

        System.out.println("En buyuk elemanim: " + enBuyuk);

        scanner.close();
    }

}