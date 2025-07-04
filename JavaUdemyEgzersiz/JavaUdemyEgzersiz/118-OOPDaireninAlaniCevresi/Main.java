import java.util.Scanner;

class Daire {
    private double yaricap;
    private static final double PI = 3.14;

    Daire(double yaricapim) {
        this.yaricap = yaricapim;
    }

    public double alaniHesapla() {
        return PI * Math.pow(yaricap, 2);
    }

    public double cevreyiHesapla() {
        return 2 * PI * yaricap;
    }

}

public class Main {
    // Dairenin alanını ve çevresini OOP kullanarak hesaplayınız

    public static void main(String[] args) {
        double yaricap, alan, cevre;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yaricap degerini giriniz: ");
        yaricap = scanner.nextDouble();

        Daire daire = new Daire(yaricap);
        alan = daire.alaniHesapla();
        cevre = daire.cevreyiHesapla();

        System.out.println("Alan: " + alan);
        System.out.println("Cevre: " + cevre);

        scanner.close();
    }

}