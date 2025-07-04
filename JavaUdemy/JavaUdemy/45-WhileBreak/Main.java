import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan negatif sayı girilinceye kadar sayı alın ve değerlerin toplamını
        // ekrana bastırın

        int toplam = 0, sayi;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Sayi giriniz: ");
            sayi = input.nextInt();
            if (sayi < 0) {
                break;
            }
            toplam += sayi;
        }
        System.out.println("Toplam = " + toplam);
        input.close();

    }
}