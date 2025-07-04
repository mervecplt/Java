import java.util.Scanner;

class Ucgen {
    private double side1;
    private double side2;
    private double side3;

    Ucgen(double s1, double s2, double s3) {
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    public void tipiBelirle() {
        if ((this.side1 == this.side2) && (this.side2 == this.side3)) {
            System.out.println("Eskenar ucgen");
        } else if (this.side1 == this.side2 || this.side1 == this.side3 || this.side2 == this.side3) {
            System.out.println("Ikizkenar ucgen");
        } else {
            System.out.println("Cesitkenar ucgen");
        }
    }

}

public class Main {
    // Ucgenin eskenar mı cesitkenar mı ikizkenar mı oldugunu OOP yardımıyla bulunuz
    public static void main(String[] args) {
        double s1, s2, s3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        s1 = scanner.nextDouble();
        s2 = scanner.nextDouble();
        s3 = scanner.nextDouble();

        Ucgen ucgen = new Ucgen(s1, s2, s3);
        ucgen.tipiBelirle();
    }

}