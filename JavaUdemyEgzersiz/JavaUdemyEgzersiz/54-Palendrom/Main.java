import java.util.Scanner;

public class Main {
    /*
     * Girilen Sayının Palendrome Olup Olmadığını Bulun
     * Tersi Kendisine Eşit Sayılar Palendrom Sayılardır
     */

    public static void main(String[] args) {
        int n, ters, kalan, orgsayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        n = scanner.nextInt();
        orgsayi = n;

        ters = 0;

        while (n != 0) {
            kalan = n % 10;
            ters = ters * 10 + kalan;
            n = n / 10;
        }

        System.out.println("Sayimizin tersi: " + ters);

        if (orgsayi == ters) {
            System.out.println("Sayimiz palendromdur");
        } else {
            System.out.println("Sayimiz palendrom sayi degildir");
        }
        scanner.close();
    }

}