import java.util.Scanner;

public class Main {
    /*
     * Bir halıcı çocuklar için 3 ayrı tip halı satmaktadır.
     * Bu halıların tipi kodu ve metrekare birim fiyatları aşağıda verilmiştir.
     * 
     * 
     * Halı Tipi Kodu Metrekare Birim Fiyatı
     * Twetty T 18
     * Bugs B 17
     * Spiderman S 19
     * 
     * 
     * Sipariş alınan halı tipi ve döşenecek alanın metrekaresi girildiğinde
     * ödenecek tutarı hesaplayan programı yazınız
     * 
     */

    public static void main(String[] args) {
        char kod;
        float alan, ucret;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hali tipi (T, B, S) giriniz: ");
        kod = scanner.next().charAt(0);
        System.out.print("Alani giriniz: ");
        alan = scanner.nextFloat();

        if (kod == 'T') {
            ucret = 18 * alan;
            System.out.printf("Hali maliyeti %.2f", ucret);
        } else if (kod == 'B') {
            ucret = 17 * alan;
            System.out.printf("Hali maliyeti %.2f", ucret);
        } else if (kod == 'S') {
            ucret = 19 * alan;
            System.out.printf("Hali maliyeti %.2f", ucret);
        } else {

            System.out.println("Yanlis hali tipi girdiniz");

        }

        scanner.close();
    }

}