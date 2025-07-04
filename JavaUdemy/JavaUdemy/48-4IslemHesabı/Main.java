import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Switch Case İle 4 İşlem Hesabını Yapınız
        char operator;
        Double sayi1, sayi2, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi islemi yapmak istiyorsunuz (+ - * /) : ");
        operator = input.next().charAt(0);

        System.out.print("Ilk sayiyi giriniz: ");
        sayi1 = input.nextDouble();

        System.out.print("Ikinci sayiyi giriniz: ");
        sayi2 = input.nextDouble();

        switch (operator) {
            case '+':
                sonuc = sayi1 + sayi2;
                System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                System.out.println(sayi1 + " * " + sayi2 + " = " + sonuc);
                break;
            case '/':
                sonuc = sayi1 / sayi2;
                System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
                break;
            default:
                System.out.println("Yanlis operator girdiniz");
                break;
        }

        input.close();

    }
}