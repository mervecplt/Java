import java.util.Scanner;

public class Main {
    /*
     * Kullanıcı tarafından N elemanlı bir diziye alınan tamsayıların ortalamasının
     * bulunmasını fonksiyon kullanarak bulunuz
     * 
     * 
     */
    public static double ortalamaBul(int[] dizim, int boyut) {
        int toplam = 0, i;

        for (i = 0; i < boyut; i++) {
            toplam += dizim[i];
        }
        return (double) toplam / boyut;
    }

    public static void main(String[] args) {
        int n, i;
        double sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac adet eleman girilecek: ");
        n = scanner.nextInt();

        int[] dizi = new int[n];

        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayiyi giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        sonuc = ortalamaBul(dizi, n);

        System.out.println("Dizimizdeki sayilarin ortalamasi: " + sonuc);

        scanner.close();
    }

}