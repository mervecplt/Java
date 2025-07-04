import java.util.Scanner;

public class Main {
    /*
     * Kullanıcının girmesini
     * istediği a,b,c ve x değerlerini kullanarak
     * aşağıdaki aritmetik işlemin sonucunu hesaplayan ve ekrana bastıran
     * programı yazınız.
     * 
     * ax^2 + b^x + c = ?
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, x, sonuc;
        System.out.println("Lutfen a,b,c ve x degerlerini giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        x = scanner.nextInt();

        sonuc = a * x * x + b * x + c;
        System.out.println("ax^2 + bx + c degerim: " + sonuc);
        scanner.close();
    }

}