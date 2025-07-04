import java.util.Scanner;

public class Main {
    // Haftanın günlerini 1 ile 7 arasında bir değer girerek
    // do while döngüsü kullanarak ekrana bastırınız
    public static void main(String[] args) {
        String[] gunler = { "Pazartesi", "Salı", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar" };
        int n;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Lutfen 1 ile 7 arasinda bir deger giriniz: ");
            n = scanner.nextInt();
        } while (n <= 0 || n > 7);

        System.out.println(n + " numarali haftanin gunu " + gunler[n - 1]);
        scanner.close();

    }

}