import java.util.Scanner;

public class Main {
    /*
     * Kullanıcı tarafından bölünen ve bölen değerleri girilerek bölme işlemi
     * yapılmak istenmektedir.
     * Buna göre bölüm ve kalanın elde
     * edilmesini sağlayan programı fonksiyon kullanarak yazınız
     * 
     */

    public static void bolmeIslemi(int bolunen, int bolen) {
        int bolum, kalan;
        bolum = bolunen / bolen;
        kalan = bolunen % bolen;

        System.out.println("Bolum = " + bolum + " Kalan = " + kalan);
    }

    public static void main(String[] args) {
        int bolunen, bolen;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bolunen sayiyi giriniz: ");
        bolunen = scanner.nextInt();

        System.out.print("Lutfen bolen sayiyi giriniz: ");
        bolen = scanner.nextInt();

        bolmeIslemi(bolunen, bolen);

        scanner.close();
    }

}