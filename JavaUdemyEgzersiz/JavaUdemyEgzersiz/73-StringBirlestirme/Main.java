import java.util.Scanner;

public class Main {
    // Ad ve Soyad Değerlerini ayrı ayrı string değişkenlerde tutunuz ve
    // birleştirme işlemi yapıp ekrana basınız
    public static void main(String[] args) {
        String ad, soyad, adSoyad;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adinizi giriniz: ");
        ad = scanner.nextLine();

        System.out.print("Soyadinizi giriniz: ");
        soyad = scanner.nextLine();

        adSoyad = ad + " " + soyad;

        System.out.println("Ad soyad: " + adSoyad);

        scanner.close();

    }

}