import java.util.Scanner;

public class Main {
    /*
     * Kullanıcının girdiği 2 tam sayıdan,ilkinin ikincisi ile karşılaştırılıp eşit
     * olup olmadığını,
     * eğer eşit değilse ikincisinden büyük mü yoksa küçük mü olduğunu
     * ekrana bastıran bir program yazınız
     */
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 adet sayi giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a == b) {
            System.out.println("Iki sayi birbirine esittir");
        }
        if (a != b) {
            System.out.println("Iki sayi birbirine esit degildir");
        }
        if (a > b) {
            System.out.println("a sayisi b sayisindan buyuktur");
        }
        if (a < b) {
            System.out.println("a sayisi b sayisindan kucuktur");
        }

        scanner.close();
    }

}