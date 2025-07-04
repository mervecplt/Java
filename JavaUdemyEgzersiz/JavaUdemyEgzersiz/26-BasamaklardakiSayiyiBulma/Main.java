import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan bir sayı değeri alıp basamaklardaki sayıları bulunuz
     */
    public static void main(String[] args) {

        int sayi, birlerBas, onlarBas;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        birlerBas = sayi % 10;
        onlarBas = (sayi % 100) / 10;

        System.out.println("Sayimizin birler basamagi: " + birlerBas);
        System.out.println("Sayimizin onlar basamagi: " + onlarBas);

        scanner.close();
    }

}