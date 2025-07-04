import java.util.Scanner;

public class Main {
    /*
     * Yarıcap degerini girip dairenin alanını ve cevresini hesaplayan Java
     * programını yazınız
     */
    public static void main(String[] args) {

        final double PI = 3.14;

        double yaricap, alan, cevre;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen yaricap degerini giriniz: ");
        yaricap = scanner.nextDouble();

        alan = PI * yaricap * yaricap;
        cevre = 2 * PI * yaricap;

        System.out.println("Dairenin alani: " + alan);
        System.out.printf("Dairenin cevresi: %.2f ", cevre);

        scanner.close();
    }

}