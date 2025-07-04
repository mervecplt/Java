import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen pozitif bir N tamsayısına kadar olan çift sayıları ekrana
     * listeleyen programı fonksiyon kullanarak yazınız
     */
    public static void ciftSayilar(int n) {
        int i = 0;
        while (i < n) {
            if (i % 2 == 0) {
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
        ciftSayilar(sayi);

        scanner.close();
    }

}