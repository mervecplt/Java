import java.util.Scanner;

public class Main {
    /*
     * A ve B değişkenlerine iki tamsayıyı girdi olarak alan ve yerini değiştiren
     * programı yazınız
     */

    public static void main(String[] args) {
        int a, b, gecici;
        Scanner scanner = new Scanner(System.in);

        System.out.print("A sayisini giriniz: ");
        a = scanner.nextInt();

        System.out.print("B sayisini giriniz: ");
        b = scanner.nextInt();

        System.out.println("Yerdegistirmeden once:");
        System.out.println("A sayisi:" + a);
        System.out.println("B sayisi:" + b);

        gecici = a;
        a = b;
        b = gecici;

        System.out.println("Yerdegistirmeden sonra:");
        System.out.println("A sayisi:" + a);
        System.out.println("B sayisi:" + b);
        scanner.close();
    }

}