import java.util.Scanner;

public class Main {

    /*
     * Üs Değeri Almayı While Döngüsü Kullanarak Yapınız
     */

    public static void main(String[] args) {
        int taban, us, sonuc, usdegerim;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban ve us degerini giriniz: ");
        taban = scanner.nextInt();
        us = scanner.nextInt();
        usdegerim = us;
        sonuc = 1;

        while (us != 0) {
            sonuc = sonuc * taban;
            us--;
        }

        System.out.println(taban + "^" + usdegerim + " = " + sonuc);

        scanner.close();
    }

}