import java.util.Scanner;

public class Main {

    // Kullanının Girdiği Sayı Kadar Fibonacci Sayısı Hesaplayıp Ekrana Bastırın
    // Fibonacci Serisi: 0, 1, 1, 2, 3, 5, 8, 13, 21
    public static void main(String[] args) {
        int n, i;
        int sayi1 = 0, sayi2 = 1, sonraki;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac adet fibonacci sayisi istiyorsunuz: ");
        n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Lutfen positif bir sayi giriniz!");
        } else {
            for (i = 1; i <= n; i++) {
                if (i == 1) {
                    System.out.print(sayi1 + " ");
                    continue;
                }
                if (i == 2) {
                    System.out.print(sayi2 + " ");
                    continue;
                }
                sonraki = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2 = sonraki;

                System.out.print(sonraki + " ");
            }
        }

        scanner.close();
    }

}