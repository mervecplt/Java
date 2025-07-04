import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen iki tamsayının toplamını fonksiyon kullanarak hesaplayan
     * programı yazınız
     */

    public static int topla(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sayi1, sayi2, toplam;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 adet sayi giriniz: ");
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        toplam = topla(sayi1, sayi2);
        System.out.println("Sayilarin toplami: " + toplam);

        scanner.close();

    }

}