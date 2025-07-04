import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan bir değer alın girilen sayının tek mi çift mi olduğunu ekrana
     * bastırın
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi;

        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        if (sayi % 2 == 1) {
            System.out.print("Sayimiz tek sayidir ");
        } else {
            System.out.print("Sayimiz cift sayidir ");
        }

        scanner.close();
    }

}