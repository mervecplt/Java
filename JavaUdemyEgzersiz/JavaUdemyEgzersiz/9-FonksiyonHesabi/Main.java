import java.util.Scanner;

public class Main {
    /*
     * f(x) = x^3 + 13x^2 + 47x + 5 Kullanıcıdan x değerini alıp f(x)
     * fonksiyonun değerini hesaplayan java programını yazınız.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x, sonuc;

        System.out.print("Lutfen bir sayi giriniz: ");
        x = scanner.nextFloat();

        sonuc = x * x * x + 13 * x * x + 47 * x + 5;
        System.out.print("f(" + x + ") = " + sonuc);

        scanner.close();
    }

}