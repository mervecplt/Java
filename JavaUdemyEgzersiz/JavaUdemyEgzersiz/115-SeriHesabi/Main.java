import java.util.Scanner;

public class Main {
    /*
     * Klavyeden başlangıç,bitiş ve artım değeri girilen bir serinin elde edilmesini
     * sağlayan programı recursive fonksiyon kullanarak yazınız.
     * Örneğin başlangıç 5 bitiş 55 ve artım 7 olan bir seri 5,12,19,26,33,40,47,54
     * şeklinde olacaktır.
     */

    public static void seriOlustur(int baslangic, int bitis, int artis) {
        if (baslangic <= bitis) {
            System.out.print(baslangic + " ");
            seriOlustur(baslangic + artis, bitis, artis);
        }

    }

    public static void main(String[] args) {
        int baslangic, bitis, artis;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir baslangic degeri giriniz:");
        baslangic = scanner.nextInt();

        System.out.print("Lutfen bitis degeri giriniz:");
        bitis = scanner.nextInt();

        System.out.print("Lutfen artis degeri giriniz:");
        artis = scanner.nextInt();

        seriOlustur(baslangic, bitis, artis);

        scanner.close();
    }

}