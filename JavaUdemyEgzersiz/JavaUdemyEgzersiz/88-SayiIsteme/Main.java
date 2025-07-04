import java.util.Scanner;

public class Main {
    /*
     * Klavyeden negatif bir değer girilinceye kadar kullanıcıdan sürekli sayı
     * isteyen programı fonksiyon kullanarak yazınız
     */

    public static void sayiIste() {
        Scanner scanner = new Scanner(System.in);
        int sayi;

        while (true) {
            System.out.print("Lutfen bir sayi giriniz: ");
            sayi = scanner.nextInt();

            if (sayi < 0) {
                break;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {

        sayiIste();

    }

}