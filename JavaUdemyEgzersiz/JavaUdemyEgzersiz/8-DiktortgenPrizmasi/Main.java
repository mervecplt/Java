import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan aldığı tam sayı kenar uzunlukları (a,b) ve yükseklik
     * h bilgisini kullanarak bir dikdörtgen prizmasının sırasıyla taban alanını,
     * yanal alanlarının toplamını,
     * toplam alanını ve hacmini ekrana bastıran programın kodunu yazınız
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, h;
        int tabanAlani, yanalAlan, toplamAlan, hacim;

        System.out.println("Lutfen a , b ve h degerlerini giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        h = scanner.nextInt();

        tabanAlani = a * b;
        yanalAlan = 2 * a * h + 2 * b * h;
        toplamAlan = yanalAlan + 2 * tabanAlani;
        hacim = a * b * h;

        System.out.println("Taban alani = " + tabanAlani);
        System.out.println("Yanal alanlarin toplami = " + yanalAlan);
        System.out.println("Toplam alan = " + toplamAlan);
        System.out.println("Hacim = " + hacim);

        scanner.close();
    }

}