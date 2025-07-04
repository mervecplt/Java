import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen bir tamsayının faktoriyelini fonksiyon kullanarak
     * hesaplayan programı yazınız
     */
    public static int faktoriyel(int sayim) {
        int i, sonuc;
        sonuc = 1;
        for (i = 1; i <= sayim; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int sayi, sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();
        sonuc = faktoriyel(sayi);

        System.out.println(sayi + "! = " + sonuc);

        scanner.close();

    }

}