import java.util.Scanner;

public class Main {
    // T(°C) = (T(°F) - 32) × 5/9
    // Fahrenheit derece tipiden değeri Santigrat ölçeğine dönüştürün

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fah, cen;

        System.out.print("Lutfen Fahrenheit derece giriniz: ");
        fah = scanner.nextDouble();

        cen = (fah - 32) * 5 / 9;

        System.out.println("Santigrat derece: " + cen);

        scanner.close();
    }

}