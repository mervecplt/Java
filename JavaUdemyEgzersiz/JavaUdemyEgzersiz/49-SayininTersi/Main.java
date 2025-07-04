import java.util.Scanner;

public class Main {

    /*
     * Kullanıcını Girdiği Bir Sayıyı Ters Çevirip Ekrana Bastırın
     */
    public static void main(String[] args) {
        int n, ters, kalan;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        n = scanner.nextInt();

        ters = 0;

        while (n != 0) {
            kalan = n % 10;
            ters = ters * 10 + kalan;
            n = n / 10;
        }

        System.out.println("Sayimizin tersi: " + ters);

        scanner.close();
    }

}