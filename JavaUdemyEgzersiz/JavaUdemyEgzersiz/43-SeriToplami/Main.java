import java.util.Scanner;

public class Main {
    /*
     * Bir positif tam sayı olan n değeri ile bir reel sayı olan x değerini girdi
     * olarak alan
     * ve 1/x^2 + 3/x^4 + 5/x^6 + 7/x^8 + 2n-1/x^2n serisini hesaplayan programı
     * yazınız.
     * 
     * Örnek Çıktı:
     * 
     * Pozitif tamsayı:3
     * Reel sayı:1.0
     * Seri=9.0
     * 
     * 
     */
    public static void main(String[] args) {
        int n, i;
        float x;
        double seri;
        seri = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Positif sayi giriniz: ");
        n = scanner.nextInt();

        System.out.print("Reel sayi giriniz: ");
        x = scanner.nextFloat();

        for (i = 1; i <= 2 * n - 1; i += 2) {
            seri += i / Math.pow(x, i + 1);
        }

        System.out.println("Seri =  " + seri);

        scanner.close();
    }

}