import java.util.Scanner;

public class Main {
    // Recursive (özyinelemeli) yöntemle Fibonacci hesaplama

    public static int fibonacci(int sayi) {
        if (sayi == 0) {
            return 0;
        } else if (sayi == 1) {
            return 1;
        }

        return fibonacci(sayi - 1) + fibonacci(sayi - 2);
    }

    public static void main(String[] args) {
        int sayi, fibsayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hangi siradaki Fibonacci sayisini istiyorsunuz: ");
        sayi = scanner.nextInt();
        if (sayi < 0) {
            System.out.println("Negatif sayi girilemez!");
        } else {
            fibsayi = fibonacci(sayi);
            System.out.println((sayi + 1) + ". fibonacci sayim: " + fibsayi);

        }

        scanner.close();
    }

}