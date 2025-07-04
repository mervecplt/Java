import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen iki tamsayının toplamını,farkını,çarpımını ve bölümünü
     * gerçekleştiren programı fonksiyon kullanarak yazınız
     */

    public static double dortıslem(char islem, double a, double b) {
        if (islem == '+') {
            return a + b;
        } else if (islem == '-') {
            return a - b;
        } else if (islem == '*') {
            return a * b;
        } else if (islem == '/') {
            return a / b;
        } else {
            System.out.println("Yanlis operator giridiniz");
            return 0;
        }
    }

    public static void main(String[] args) {
        double sayi1, sayi2, sonuc;
        char islem;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hangi islemi yapmak istiyorsunuz (+ - * /) : ");
        islem = scanner.next().charAt(0);

        System.out.println("Lutfen 2 adet sayi giriniz: ");
        sayi1 = scanner.nextDouble();
        sayi2 = scanner.nextDouble();
        sonuc = dortıslem(islem, sayi1, sayi2);

        if (sonuc != 0) {
            System.out.println("Islem sonucu " + sonuc);
        }

        scanner.close();

    }

}