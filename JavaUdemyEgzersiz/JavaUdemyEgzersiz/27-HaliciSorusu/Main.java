import java.util.Scanner;

public class Main {
    /*
     * Bir öğrenci evinde öğrenciler salonu halıyla kaplatmak istemektedir.
     * Döşenecek halının metrekaresi 150 Tl’dir.
     * Ayrıca halıcı salonu döşemek için 1000 Tl işçilik almaktadır.
     * Buna göre metrekareyi girdi olarak alan ve halıcıya ödenmesi gereken
     * toplam tutarı hesaplayan programı yazınız.
     * 
     */

    public static void main(String[] args) {
        final int BIRIM = 150;
        final int EMEK = 1000;
        float metrekare, ucret;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen salonunun metrekaresini giriniz: ");
        metrekare = scanner.nextFloat();

        ucret = metrekare * BIRIM + EMEK;

        System.out.printf("Toplam maliye : %.2f", ucret);
        scanner.close();
    }

}