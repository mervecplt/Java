import java.util.Scanner;

public class Main {
    // Üs değeri hesaplamayı fonksiyon kullanarak yapınız

    public static int us(int taban, int us) {
        int i, sonuc;
        sonuc = 1;
        for (i = 1; i <= us; i++) {
            sonuc = sonuc * taban;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int a, b, sonucum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen taban ve us degerini giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        sonucum = us(a, b);

        System.out.println(a + " ^ " + b + " = " + sonucum);

        scanner.close();

    }

}