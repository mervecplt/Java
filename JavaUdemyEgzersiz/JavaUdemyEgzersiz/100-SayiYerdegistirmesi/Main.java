import java.util.Scanner;

public class Main {
    /*
     * Kullanıcı tarafından girilen tamsayılar x ve y değişkenlerinde
     * tutulmaktadır.X ve Y değişkenlerinde
     * yer alan değerlerin yerlerinin değiştirilmesini sağlayan programı fonksiyon
     * kullanarak yazınız
     */

    public static int[] yerdegistir(int x, int y) {
        int gecici;

        gecici = x;
        x = y;
        y = gecici;

        return new int[] { x, y };

    }

    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 adet sayi giriniz:");
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("Yerdegistirmeden once X:" + x + " Y:" + y);
        int[] yeniDegerler = yerdegistir(x, y);

        System.out.println("Yerdegistirmeden sonra X:" + yeniDegerler[0] + " Y:" + yeniDegerler[1]);
        scanner.close();
    }

}