import java.net.Socket;
import java.util.Scanner;

public class Main {
    /*
     * Kullanıcı tarafından Celcius olarak girilen bir değerin Fayrenayt'a,Fayrenayt
     * olarak girilen bir değerin Celcius'a dönüştürülmesini sağlayan programı
     * fonksiyon
     * kullanarak
     * yazınız
     * 
     * f=(1.8*c)+32 c=(5/9)*(F-32)
     */

    public static double FdenCye(double f) {
        return ((double) 5 / 9) * (f - 32);
    }

    public static double CdenFye(double c) {
        return (1.8 * c) + 32;
    }

    public static void main(String[] args) {
        int secim;
        double fahrenheit, celcius, sonuc;
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Fahrenheit => Celcius");
        System.out.println("2. Celcius => Fahrenheit");
        System.out.print("Lutfen seciminiz yapiniz(1 veya 2): ");
        secim = scanner.nextInt();

        if (secim == 1) {
            System.out.print("Lutfen Fahrenheit derece giriniz: ");
            fahrenheit = scanner.nextDouble();
            sonuc = FdenCye(fahrenheit);
            System.out.printf("%.2f F = %.2f C", fahrenheit, sonuc);

        } else if (secim == 2) {
            System.out.print("Lutfen Celcius derece giriniz: ");
            celcius = scanner.nextDouble();
            sonuc = CdenFye(celcius);
            System.out.printf("%.2f C = %.2f F", celcius, sonuc);

        } else {
            System.out.println("Yanlis secim yaptiniz!");
        }

        scanner.close();
    }

}