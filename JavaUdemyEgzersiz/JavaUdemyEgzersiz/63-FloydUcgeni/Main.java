import java.util.Scanner;

public class Main {
    /*
     * Floyd Üçgeni Oluşturma
     */

    public static void main(String[] args) {
        int i, j;
        int satir, sayi;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen satir sayisini giriniz: ");
        satir = scanner.nextInt();

        sayi = 1;

        for (i = 1; i <= satir; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(sayi + " ");
                sayi++;
            }
            System.out.println();
        }

    }

}