import java.util.Scanner;

public class Main {

    /*
     * --Tek Boyutlu Sayı Dizisi Egzersizleri
     * 
     * Kullanıcıdan n tane sayı alınız ve bu n sayıdan en küçük elemanı bulunuz
     * Girdiğiniz n değerinin 0 ile 100 arasında olmasına dikkat ediniz
     */

    public static void main(String[] args) {
        int n, i, enKucuk;

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

        enKucuk = dizim[0];
        for (i = 1; i < n; i++) {
            if (dizim[i] < enKucuk) {
                enKucuk = dizim[i];
            }
        }

        System.out.println("En kucuk elemanim: " + enKucuk);

        scanner.close();
    }

}