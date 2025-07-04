import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen bir N sayısından başlayarak aşağı yönde azalacak şekilde
     * ekrana yıldız basan programı recursive fonksiyon yardımıyla yazınız.
     * Örnek ekran görüntüsü
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    public static void yildiz(int limit) {

        if (limit == 0) {
            return;
        } else {
            for (int i = 0; i < limit; i++) {
                System.out.print("* ");
            }
            System.out.println();
            yildiz(limit - 1);
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen ust sinir yidiz sayisini giriniz: ");
        n = scanner.nextInt();

        yildiz(n);

        scanner.close();
    }

}