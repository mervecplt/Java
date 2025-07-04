import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen pozitif bir N tamsayısına kadar olan tek sayıları ekrana
     * listeleyen programı fonksiyon kullanarak yazınız
     */
    public static void tekSayilar(int n) {
        int i = 0;
        while (i <= n) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {

        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = scanner.nextInt();
        tekSayilar(sayi);

        scanner.close();
    }

}