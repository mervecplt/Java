import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen bir N pozitif tamsayısına kadar olan asal sayıların ekrana
     * listelenmesini sağlayan programı recursive fonksiyon yardımıyla yazınız
     */

    public static boolean asalmi(int sayi, int i) {
        if (i == 1) {
            return true;
        } else if (sayi % i == 0) {
            return false;
        }
        return asalmi(sayi, i - 1);
    }

    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        n = scanner.nextInt();

        System.out.println("Asal sayilar:");
        for (i = 2; i <= n; i++) {
            if (asalmi(i, i / 2)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

}