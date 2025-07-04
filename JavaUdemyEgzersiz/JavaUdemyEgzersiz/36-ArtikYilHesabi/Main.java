import java.util.Scanner;

public class Main {

    // Artık Yıl Hesabı
    // If Else If Else Yapısı Kullanarak Yapınız
    // 4 İle bölünebilen yıllar artık yıllardır ( sonu 00 la bitenler hariç) 400 e
    // tam bölünenlerde
    // artık yıldır
    public static void main(String[] args) {
        int yil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        yil = scanner.nextInt();

        if (yil % 400 == 0) {
            System.out.println(yil + " artik yildir");
        } else if (yil % 100 == 0) {
            System.out.println(yil + " artik yil degildir");
        } else if (yil % 4 == 0) {
            System.out.println(yil + " artik yildir");
        } else {
            System.out.println(yil + " artik yil degildir");
        }

        scanner.close();
    }

}