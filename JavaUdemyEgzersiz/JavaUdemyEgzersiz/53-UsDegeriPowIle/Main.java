import java.util.Scanner;

public class Main {
    /*
     * Üs Değeri Alma Pow İle
     */

    public static void main(String[] args) {
        int taban, us, sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban ve us degerini giriniz: ");
        taban = scanner.nextInt();
        us = scanner.nextInt();

        sonuc = (int) Math.pow(taban, us);

        System.out.println(taban + "^" + us + " = " + sonuc);

        scanner.close();
    }

}