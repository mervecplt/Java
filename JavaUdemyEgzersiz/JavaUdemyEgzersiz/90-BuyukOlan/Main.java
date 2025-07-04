import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen iki tamsayıdan büyük olanını
     * fonksiyon kullanarak bulan programı yazınız
     */
    public static int buyukOlan(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return 0;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        int sayi1, sayi2, sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 adet sayi giriniz:");
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        sonuc = buyukOlan(sayi1, sayi2);

        if (sonuc == 1) {
            System.out.println(sayi1 + " " + sayi2 + " den daha buyuktur");
        } else if (sonuc == 0) {
            System.out.println(sayi2 + " " + sayi1 + " den daha buyuktur");
        } else {
            System.out.println(sayi2 + " " + sayi1 + " e esittir");
        }

        scanner.close();
    }

}