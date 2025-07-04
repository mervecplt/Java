import java.util.Scanner;

public class Main {
    // Girilen bir sayi içindeki basamakladaki sayıların toplamını recursive
    // fonksiyon kullanarak bulunuz

    public static int topla(int sayi) {

        if (sayi >= 0 && sayi <= 9) {
            return sayi;
        }
        return sayi % 10 + topla(sayi / 10);
    }

    public static void main(String[] args) {
        int sayi, toplam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        toplam = topla(sayi);

        System.out.println("Basamaklardaki sayilarin toplami: " + toplam);

        scanner.close();
    }

}