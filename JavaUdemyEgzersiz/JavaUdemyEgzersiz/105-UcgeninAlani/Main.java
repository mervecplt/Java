import java.net.Socket;
import java.util.Scanner;

public class Main {
    /*
     * Kenar uzunlukları birbirinden farklı eşkanar bir üçgenin alanının bulunmasını
     * sağlayan programı
     * fonksiyon kullanarak yazınız.
     * 
     * u=(a+b+c)/2
     * Alan^2=u*(u-a)*(u-b)*(u-c)
     */

    public static double ucgeninAlani(int A, int B, int C) {
        double alan, u;
        u = (A + B + C) / 2;
        alan = Math.sqrt(u * (u - A) * (u - B) * (u - C));
        return alan;
    }

    public static void main(String[] args) {
        int a, b, c;
        double alan;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen uc kenar uzunlugunu giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        alan = ucgeninAlani(a, b, c);
        System.out.printf("Ucgenin alani %.2f", alan);

        scanner.close();
    }

}