import java.util.Scanner;

public class Main {
    // Kullanıcıdan iki adet tamsayi degeri alınız bu aldığınız değerleri ekrana
    // bastırınız

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2;

        System.out.println("Lutfen 2 adet sayi giriniz: ");
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        System.out.println("Ilk sayim: " + sayi1 + " Ikinci sayim: " + sayi2);

        scanner.close();
    }

}