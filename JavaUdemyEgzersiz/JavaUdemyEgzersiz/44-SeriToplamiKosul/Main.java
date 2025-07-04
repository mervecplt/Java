import java.util.Scanner;

public class Main {
    /*
     * Bir önceki egzersizdeki seri hesaplamasını
     * birden fazla n ve x çiftleri için hesaplayacak şekilde yeniden yazınız.
     * Programda her seri hesaplamasından sonra kullanıcıya devam edilip
     * edilmeyeceği sorulmalıdır.
     * Kullanıcı devam etmek istiyorsa evet analamına gelen 'E' veya 'e'
     * girilmelidir.
     * Diğer karakter girişlerinde ise program sonlandırılmalıdır.
     * 
     * 
     * Örnek Çıktı:
     * 
     * Pozitif tamsayı:3
     * Reel sayı:1.0
     * Seri=9.0
     * 
     * Devam edecek misiniz:E
     * 
     * Pozitif tamsayı:2
     * Reel sayı:1.5
     * Seri=1.04
     * Devam edecek misiniz:T
     * Hoscakalin
     * 
     */
    public static void main(String[] args) {
        int n, i;
        float x;
        double seri;
        seri = 0;
        Scanner scanner = new Scanner(System.in);
        char devam;

        do {
            System.out.print("Positif sayi giriniz: ");
            n = scanner.nextInt();

            System.out.print("Reel sayi giriniz: ");
            x = scanner.nextFloat();

            for (i = 1; i <= 2 * n - 1; i += 2) {
                seri += i / Math.pow(x, i + 1);
            }

            System.out.println("Seri =  " + seri);
            System.out.println("Devam etmek istiyor musunuz? (E/e ile devam:)");
            devam = scanner.next().charAt(0);
        } while (devam == 'E' || devam == 'e');

        scanner.close();
    }

}