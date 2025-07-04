import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen pozitif bir tamsayının tek ya da çift olduğunu
     * fonksiyon kullanarak bulan programı yazınız
     */
    public static int tekCift(int n) {
        return n % 2;
    }

    public static void main(String[] args) {

        int sayi, sonuc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi = scanner.nextInt();

        sonuc = tekCift(sayi);

        if (sonuc == 0) {
            System.out.println(sayi + " degerim cifttir");
        } else {
            System.out.println(sayi + " degerim tektir");
        }

        scanner.close();
    }

}