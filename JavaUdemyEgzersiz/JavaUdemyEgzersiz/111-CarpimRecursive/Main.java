import java.util.Scanner;

public class Main {
    // Çarpı operatörü kullanmadan iki sayının çarpımını recursive fonksiyon
    // kullanarak bulunuz

    public static int carpim(int sayi1, int sayi2) {

        if (sayi2 == 0) {
            return 0;
        }
        return sayi1 + carpim(sayi1, sayi2 - 1);
    }

    public static void main(String[] args) {
        int sayi1, sayi2, sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ilk sayimizi giriniz: ");
        sayi1 = scanner.nextInt();

        System.out.print("Ikinci sayimizi giriniz: ");
        sayi2 = scanner.nextInt();

        sonuc = carpim(sayi1, sayi2);

        System.out.println("Iki sayinin carpimi: " + sonuc);

        scanner.close();
    }

}