import java.util.Scanner;

public class Main {
    /*
     * 1 den 10 a kadar her bir sayının faktoriyelini fonksiyon kullanarak
     * hesaplayan ve sonuçları ekrana listeleyen programı yazınız
     */

    public static int faktoriyel(int sayim) {
        int i, sonuc;
        sonuc = 1;
        for (i = 1; i <= sayim; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i + "! = " + faktoriyel(i));
        }

    }

}