import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1, sayi2, gecici, ebob, i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki adet sayi giriniz:");
        sayi1 = scanner.nextInt();
        sayi2 = scanner.nextInt();

        if (sayi2 > sayi1) {
            gecici = sayi2;
            sayi2 = sayi1;
            sayi1 = gecici;
        }
        ebob = 1;

        for (i = 1; i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }

        System.out.println("Ebob degerim: " + ebob);

        scanner.close();
    }

}