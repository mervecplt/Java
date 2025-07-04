import java.util.Scanner;

public class Main {
    // Dikdörtgenin alanını ve çevresini hesaplayıp ekrana bastırınız

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kisaKenar, uzunKenar, alan, cevre;

        System.out.print("Lutfen kisa kenari giriniz: ");
        kisaKenar = scanner.nextInt();

        System.out.print("Lutfen uzun kenar degerini giriniz: ");
        uzunKenar = scanner.nextInt();

        alan = kisaKenar * uzunKenar;
        cevre = 2 * (kisaKenar + uzunKenar);

        System.out.println("Dikdortgenimizin alani: " + alan);
        System.out.println("Dikdortgenimizin cevresi: " + cevre);
        scanner.close();
    }

}