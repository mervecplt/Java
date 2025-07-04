import java.util.Scanner;

public class Main {
    /*
     * Bir arabanın gittiği yolu
     * mil cinsinden girdi olarak alan ve bunu km ye çeviren bir program yazınız
     * (1 mil = 1.609 km)
     */
    public static void main(String[] args) {
        final double MIL_TO_KM = 1.609;
        double milYol, kmYol;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mil cinsinden arabanin gittigi yolu giriniz: ");
        milYol = scanner.nextDouble();
        kmYol = milYol * MIL_TO_KM;

        System.out.println("Araba " + kmYol + " km gitmistir");

        scanner.close();
    }

}