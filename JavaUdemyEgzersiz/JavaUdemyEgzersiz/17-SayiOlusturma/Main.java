import java.util.Scanner;

public class Main {
    /*
     * Sayı Oluşturma
     * Tek haneli 3 sayı olan x,y ve z yi girdi olarak alan ve yüzler basamağına x
     * onlar basamağına y ve birler basamağına z koyan ve sonunda bu sayıyı bulan
     * programı yazınız.
     */

    public static void main(String[] args) {

        int x, y, z, sayiTotal;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yuzler basamagindaki sayiyi giriniz: ");
        x = scanner.nextInt();

        System.out.print("Onlar basamagindaki sayiyi giriniz: ");
        y = scanner.nextInt();

        System.out.print("Birler basamagindaki sayiyi giriniz: ");
        z = scanner.nextInt();

        sayiTotal = 100 * x + 10 * y + z;

        System.out.println("Sayimiz: " + sayiTotal);

        scanner.close();
    }

}