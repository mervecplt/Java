import java.util.Scanner;

public class Main {
    // Bölünen ve bölen sayi degerlerini alınız bölüm ve kalan değerlerini bulup
    // ekrana bastırınız

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bolunen, bolen, bolum, kalan;

        System.out.print("Lutfen bolunen sayiyi giriniz: ");
        bolunen = scanner.nextInt();

        System.out.print("Lutfen bolen sayiyi giriniz: ");
        bolen = scanner.nextInt();

        bolum = bolunen / bolen;
        kalan = bolunen % bolen;

        System.out.println(bolunen + " sayisinin " + bolen + " ile bolumu = " + bolum + " ve kalan degeri = " + kalan);

        scanner.close();
    }

}