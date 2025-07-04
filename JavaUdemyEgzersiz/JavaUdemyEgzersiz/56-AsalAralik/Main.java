import java.util.Scanner;

public class Main {
    /*
     * //Girilen 2 Sayı Arasındaki Asal Sayıları Bulup Ekrana Bastırın
     * //0 ile 1 asal sayı değildir
     * 
     */

    public static void main(String[] args) {
        boolean asalmi;
        int kucuk, buyuk, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki adet sayi giriniz: ");
        kucuk = scanner.nextInt();
        buyuk = scanner.nextInt();

        while (kucuk < buyuk) {
            asalmi = true;
            if (kucuk == 0 || kucuk == 1) {
                asalmi = false;
            }

            for (i = 2; i <= kucuk / 2; i++) {
                if (kucuk % i == 0) {
                    asalmi = false;
                    break;
                }
            }

            if (asalmi) {
                System.out.print(kucuk + " ");
            }
            kucuk++;
        }

        scanner.close();
    }

}