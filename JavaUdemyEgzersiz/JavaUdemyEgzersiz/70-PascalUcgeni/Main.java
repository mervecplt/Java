import java.util.Scanner;

public class Main {
    // Pascal Hesabı
    // dizi[i][j]=dizi[i-1][j]+dizi[i-1][j-1];
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, i, j;

        System.out.print("Kac satirlik bir Pascal Ucgeni istiyorsunuz: ");
        n = scanner.nextInt();

        int[][] dizi = new int[n][n];
        System.out.print("\n\np   ");
        for (i = 0; i < n; i++) {
            System.out.print("   " + i);
        }
        System.out.println("\nn");
        for (i = 0; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();
        for (i = 0; i < n; i++) {
            dizi[i][0] = 1;
            dizi[i][i] = 1;
            for (j = 1; j < i; j++) {
                dizi[i][j] = dizi[i - 1][j] + dizi[i - 1][j - 1];
            }
        }

        for (i = 0; i < n; i++) {
            System.out.printf("%d --", i);
            for (j = 0; j <= i; j++) {
                System.out.printf("%4d", dizi[i][j]);
            }
            System.out.println();
        }

    }

}