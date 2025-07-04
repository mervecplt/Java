import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan 3 adet tamsayı alıp bunların ortalamasını bulan programı
     * yazınız.
     */

    public static void main(String[] args) {

        double x, y, z, ortalama;

        Scanner scanner = new Scanner(System.in);

        System.out.println("3 adet sayi giriniz: ");
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();

        ortalama = (x + y + z) / 3;

        System.out.printf("Ortalama %.2f", ortalama);

        scanner.close();
    }

}