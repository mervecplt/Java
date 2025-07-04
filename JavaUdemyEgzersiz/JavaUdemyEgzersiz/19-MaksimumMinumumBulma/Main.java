import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan 3 farklı tam sayı girmesini isteyen, kullanıcıların girdiği bu
     * sayıları
     * okuyup sayıların en küçüğünü ve en büyüğünü ekrana bastıran programın kodunu
     * yazınız.
     */

    public static void main(String[] args) {
        int a, b, c, max, min;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 adet sayi giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Maksimum degerim: " + max);

        min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        System.out.println("Minumum degerim: " + min);

        scanner.close();
    }

}