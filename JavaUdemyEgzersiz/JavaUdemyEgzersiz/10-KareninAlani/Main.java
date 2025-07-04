import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan kenar uzunluğunu alıp karenin alanını hesaplayınız
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kenar, alan;

        System.out.print("Kenar uzunlugunu giriniz: ");
        kenar = scanner.nextInt();

        alan = kenar * kenar;

        System.out.println("Karenin alani = " + alan);

        scanner.close();
    }

}