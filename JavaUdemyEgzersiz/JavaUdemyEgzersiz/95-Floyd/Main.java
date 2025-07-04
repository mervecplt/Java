import java.util.Scanner;

public class Main {
    // Floyd Üçgeni Oluşturmayı Fonksiyon Yardımıyla Bulma

    public static void floyd(int n) {
        int i, j, a;

        a = 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int satir;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac satirlik bir Floyd Ucgeni istiyorsunuz: ");
        satir = scanner.nextInt();

        floyd(satir);

        scanner.close();
    }

}