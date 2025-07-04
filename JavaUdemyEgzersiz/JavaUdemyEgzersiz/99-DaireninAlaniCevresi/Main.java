import java.util.Scanner;

public class Main {
    // Dairenin alanını
    // ve cevresini
    // fonksiyon kullanarak bulunuz
    static final double PI = 3.14;

    public static void hesapla(double yaricap) {
        double alan, cevre;

        alan = PI * yaricap * yaricap;
        cevre = 2 * PI * yaricap;

        System.out.printf("Dairenin alani=%.2f \n", alan);
        System.out.printf("Dairenin cevresi=%.2f ", cevre);

    }

    public static void main(String[] args) {
        double yaricap;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yaricap degerini giriniz: ");
        yaricap = scanner.nextDouble();

        hesapla(yaricap);

        scanner.close();
    }

}