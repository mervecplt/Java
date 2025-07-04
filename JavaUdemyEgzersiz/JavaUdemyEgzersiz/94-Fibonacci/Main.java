import java.util.Scanner;

public class Main {
    /*
     * Her sayının kendinden önceki sayı ile toplanması sonucu oluşan sayı dizisine
     * Fibonacci dizisi adı verilmektedir.
     * Buna göre klavyeden kaç adet fibonacci sayısı üretileceği bilgisi girilerek
     * sayıların üretilmesini sağlayan programı fonksiyon kullanarak yazınız
     */

    public static void fibonacci(int n) {
        int ilk = 0, ikinci = 1, sonraki, i;
        System.out.print("Fibonacci sayilari: ");

        for (i = 0; i < n; i++) {

            if (i <= 1) {
                sonraki = i;
            } else {
                sonraki = ilk + ikinci;
                ilk = ikinci;
                ikinci = sonraki;
            }

            System.out.print(sonraki + " ");
        }

    }

    public static void main(String[] args) {
        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac adet Fibonacci sayisi uretilecek:");
        sayi = scanner.nextInt();

        fibonacci(sayi);

        scanner.close();
    }

}