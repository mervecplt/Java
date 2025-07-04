import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Öğrencinin dersi geçip geçmediğini kontrol ediniz
        // Öğrenci 50 den yüksek bir puan aldıysa dersi geçer alamadıysa geçemez

        Scanner input = new Scanner(System.in);
        System.out.print("Puaninizi giriniz: ");
        double puan = input.nextDouble();

        String sonuc = (puan >= 50) ? "Dersi geçtiniz" : "Dersten kaldiniz!";

        System.out.println(sonuc);

        input.close();

    }
}