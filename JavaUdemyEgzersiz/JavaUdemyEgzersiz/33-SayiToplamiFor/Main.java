import java.util.Scanner;

public class Main {

    // Kullanıcıdan positif bir sayi değeri alınız 1 den girilen sayiya kadar
    // sayiların toplamını
    // hem for döngüsüyle hem while döngüsüyle hem do while döngüsüyle bulunuz

    public static void main(String[] args) {
        int sayi, i, toplam;
        toplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        if (sayi > 0) {

            for (i = 0; i <= sayi; i++) {
                toplam += i;
            }

            System.out.println("Toplam degerim: " + toplam);

        } else {
            System.out.println("Lutfen positif bir sayi giriniz");
        }

        scanner.close();
    }

}