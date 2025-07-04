import java.util.Scanner;

public class Main {
    /*
     * Ortalama Hız Sorusu
     * Bir arabanın Ankara’dan İstanbul (450km)’a varış zamanını
     * saat cinsinden girdi olarak alan ve arabanın ortalama hızını hesaplayan
     * programı yazınız.
     */

    public static void main(String[] args) {

        final double YOL = 450;

        double saat, ortalamaHiz;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ankara - Istanbul arasini kac saatte gittiniz: ");
        saat = scanner.nextDouble();

        ortalamaHiz = YOL / saat;

        System.out.printf("Arabanin ortalam hizi %.2f", ortalamaHiz);

        scanner.close();
    }

}