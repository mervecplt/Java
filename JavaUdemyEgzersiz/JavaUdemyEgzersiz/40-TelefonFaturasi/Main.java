import java.util.Scanner;

public class Main {

    /*
     * Bir telefon şirketi telefonda 3 dakikaya kadar olan konuşmanın ücretini
     * 4 TL olarak belirlemiştir.Ancak şirket,
     * konuşma süresi 3 dakikayı aştığı durumda
     * bundan sonraki her dakika için ek olarak 1 TL almaktadır.
     * Telefon görüşmesinin süresini dakika cinsinden girdi olarak alan
     * ve konuşmanın ücretini hesaplayan programı yazınız.
     * 
     * Örnek Çıktı
     * 
     * konuşma süresi 8
     * 
     * Ucret 9 TL
     */
    public static void main(String[] args) {
        float sure, ucret;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Telefon gorusme suresi: ");
        sure = scanner.nextFloat();

        if (sure <= 3) {
            ucret = 4;
        } else {
            ucret = 4 + (sure - 3) * 1;
        }

        System.out.println("Ucretimiz: " + ucret);

        scanner.close();
    }

}