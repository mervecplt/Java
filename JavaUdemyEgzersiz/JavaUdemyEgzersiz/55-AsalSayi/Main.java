import java.util.Scanner;

public class Main {
    /*
     * Girilen Sayının Asal Sayı Olup Olmadığını Bulup Ekrana Bastırın
     * 0 ile 1 asal sayı değildir
     * 
     */
    public static void main(String[] args) {
        boolean asalmi = true;
        int sayi, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        if (sayi == 0 || sayi == 1) {
            asalmi = false;
        }

        for (i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                asalmi = false;
                break;
            }
        }

        if (asalmi) {
            System.out.println(sayi + " asaldir");
        } else {
            System.out.println(sayi + " asal degildir");
        }

        scanner.close();
    }

}