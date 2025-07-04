import java.util.Scanner;

public class Main {

    /*
     * Kullanıcıdan pozitif bir sayı girmesini isteyin
     * Girdiğiniz sayının karekökünü hesaplayın
     * Girdiğiniz sayı negatifse kullanıcının yeni bir sayı girmesini isteyin
     * Girdiğiniz sayı 0 ise program çalışmayı durdursun
     * Girdiğiniz sayı pozitifse karekökü hesaplayıp kullanıcının yeni bir sayı
     * girmesini isteyin
     */

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Lutfen bir sayi giriniz: ");
            x = scanner.nextInt();

            if (x < 0) {
                System.out.println("Lutfen positif bir sayi giriniz");
            } else if (x > 0) {
                System.out.printf("Sayimizin karekoku %.2f", Math.sqrt(x));
                System.out.println();
            }

        } while (x != 0);

        scanner.close();
    }

}