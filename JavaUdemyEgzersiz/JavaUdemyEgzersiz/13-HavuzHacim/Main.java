import java.util.Scanner;

public class Main {
    /*
     * Havuzun enini boyunu ve yüksekliğini metre cinsinden alan ve havuzun dolması
     * için
     * ne kadar suyun gerekli olduğunu bulan programı yazınız
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double en, boy, yukseklik, metrekup;

        System.out.println("Havuzun enini,boyunu ve yuksekligini giriniz: ");
        en = scanner.nextDouble();
        boy = scanner.nextDouble();
        yukseklik = scanner.nextDouble();

        metrekup = en * boy * yukseklik;

        System.out.printf("Havuzumuz %.2f metrekup su alabilir", metrekup);

        scanner.close();
    }

}