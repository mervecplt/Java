import java.util.Scanner;

class Dikdortgen {
    private double boy;
    private double genislik;

    Dikdortgen(double boyum, double genisligim) {
        this.boy = boyum;
        this.genislik = genisligim;
    }

    public double alaniHesapla() {
        return this.boy * this.genislik;
    }

    public double cevreyiHesapla() {
        return 2 * (this.boy + this.genislik);
    }

}

public class Main {
    // Diktortgenin alanını ve çevresini OOP kullanarak hesaplayınız

    public static void main(String[] args) {
        double boy, genislik, alan, cevre;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban boyunu giriniz: ");
        boy = scanner.nextDouble();

        System.out.print("Taban genisligini giriniz: ");
        genislik = scanner.nextDouble();

        Dikdortgen dikdortgen = new Dikdortgen(boy, genislik);

        alan = dikdortgen.alaniHesapla();
        cevre = dikdortgen.cevreyiHesapla();

        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);

        scanner.close();
    }

}