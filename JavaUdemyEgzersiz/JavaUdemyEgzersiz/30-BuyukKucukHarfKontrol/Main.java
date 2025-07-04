import java.util.Scanner;

public class Main {
    /*
     * -Kullanıcıdan büyük harf tipinde bir karakter girmesini isteyin
     * -Eğer girdiğiniz karakter büyük harf ise o harfi küçük harfe çevirin
     * -Eğer girdiğiniz karakter küçük harf ise ekrana hata mesajı bastırın
     */

    public static void main(String[] args) {
        char karakter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz: ");
        karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Kucuk harfimiz: " + Character.toLowerCase(karakter));
        } else {
            System.out.println("Yanlis bir karakter girdiniz");
        }

        scanner.close();
    }

}