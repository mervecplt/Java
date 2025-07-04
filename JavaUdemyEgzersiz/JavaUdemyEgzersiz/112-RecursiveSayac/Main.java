import java.util.Scanner;

public class Main {
    // Arrayin içinde belirli bir elamanın kaç defa kullanıldığını recursive
    // function kullanarak bulunuz

    public static int hesapla(int[] sayilar, int boy, int index, int eleman) {

        if (index == boy) {
            return 0;
        }

        if (sayilar[index] == eleman) {
            return 1 + hesapla(sayilar, boy, index + 1, eleman);
        } else {
            return hesapla(sayilar, boy, index + 1, eleman);
        }
    }

    public static void main(String[] args) {
        int[] sayilar = { 2, 5, 6, 7, 3, 32, 2, 54, 3, 6, 7, 8, 4, 3, 2, 1, 4, 6, 7 };
        int eleman, boy, sonuc;
        Scanner scanner = new Scanner(System.in);
        boy = sayilar.length;

        System.out.print("Aranacak elemani giriniz: ");
        eleman = scanner.nextInt();

        sonuc = hesapla(sayilar, boy, 0, eleman);

        System.out.println(eleman + " elemani dizide " + sonuc + " kez kullanilmistir");

        scanner.close();
    }

}