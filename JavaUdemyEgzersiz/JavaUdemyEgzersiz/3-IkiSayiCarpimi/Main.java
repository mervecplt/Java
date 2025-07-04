import java.util.Scanner;

public class Main {
    // Kullanıcıdan iki adet sayi degeri alınız bu sayıların çarpımını ekrana
    // bastırınız

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2, carpim;

        System.out.println("Lutfen 2 adet sayi giriniz: ");
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        carpim = sayi1 * sayi2;

        System.out.println("Carpim sonucu: " + carpim);

        scanner.close();
    }

}