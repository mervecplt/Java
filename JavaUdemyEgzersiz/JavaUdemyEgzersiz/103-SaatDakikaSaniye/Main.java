import java.util.Scanner;

public class Main {
    /*
     * Kullanıcı tarafından saniye olarak girilen bir değerin
     * saat:dakika:saniye(hh:mm:ss) formatına
     * dünüştürülmesini sağlayan programı fonksiyon kullanarak yazınız.
     */
    public static void saniyeyeCevir(int saniye) {
        int saat, dakika, sn, zaman;

        saat = saniye / 3600;
        zaman = saniye % 3600;
        dakika = zaman / 60;
        sn = zaman % 60;

        System.out.println(saat + ":" + dakika + ":" + sn);
    }

    public static void main(String[] args) {
        int saniye;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen saniye degerini giriniz: ");
        saniye = scanner.nextInt();

        saniyeyeCevir(saniye);

        scanner.close();
    }

}