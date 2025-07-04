import java.util.Scanner;

public class Main {
    /*
     * 1'den kullanıcının girdiği sayıya kadar olana sayıların toplamını hesaplayıp
     * ekrana bastırınız
     * Örnek Çıktı
     * 
     * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8=36
     */
    public static void main(String[] args) {

        int a, i, sonuc;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        a = scanner.nextInt();

        i = 1;
        sonuc = 0;

        while (i <= a) {

            if (i == a) {
                System.out.print(i);
            } else {
                System.out.print(i + " + ");
            }

            sonuc += i;
            i++;

        }
        System.out.print(" = " + sonuc);

        scanner.close();
    }

}