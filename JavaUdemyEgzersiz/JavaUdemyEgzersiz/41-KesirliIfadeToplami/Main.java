import java.util.Scanner;

public class Main {

    /*
     * Aşağıda belirtilen işlemleri yapan programı yazınız.
     * Toplama(+) veya çıkarma(-) operatörü giriniz.
     * 
     * '+' operatörü için 1/a + 1/b '-' operatörü için 1/a -1/b işlemlerinin
     * sonucunu
     * basit kesir cinsinden bulunuz.
     * 
     * Girilen a veya b değerlerinden biri 0 ise işlemin yapılamayacağını bir mesaj
     * ile belirtiniz.
     * 
     * Örnek Çıktı:
     * 
     * İşleminizi seçiniz(+,-): +
     * 
     * İki tamsayi giriniz: 5 8
     * 
     * 1/5 + 1/8 = 13/40
     * 
     * 
     */
    public static void main(String[] args) {
        char op;
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen islem seciniz (+,-): ");
        op = scanner.next().charAt(0);

        System.out.println("Lutfen iki adet sayi giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Islem yapilamiyor,paydada 0 yer alamaz");
        } else {
            switch (op) {
                case '+':
                    System.out.println("1/" + a + op + "1/" + b + " = " + (a + b) + "/" + (a * b));

                    break;
                case '-':
                    System.out.println("1/" + a + op + "1/" + b + " = " + (b - a) + "/" + (a * b));
                    break;

                default:
                    System.out.println("Yanlis operator girdiniz");
                    break;
            }
        }

        scanner.close();
    }

}