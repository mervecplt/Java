import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1, sayi2, ekok;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki adet sayi giriniz");
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        ekok = (sayi1 > sayi2) ? sayi1 : sayi2;

        while (true) {
            if (ekok % sayi1 == 0 && ekok % sayi2 == 0) {
                System.out.println("Ekok degerim: " + ekok);
                break;

            }
            ekok++;

        }

        scanner.close();
    }

}