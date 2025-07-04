import java.util.Scanner;

public class Main {
    /*
     * While döngüsü kullanarak kullanıcıdan
     * positif bir değer alın girilen değerden 1 e kadar olan değerleri ekrana
     * bastırınız.
     * Örnek Program
     * 10 9 8 7 6 5 4 3 2 1
     */
    public static void main(String[] args) {

        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir deger giriniz: ");
        a = scanner.nextInt();

        while (a != 0) {
            System.out.print(a + "   ");
            a = a - 1;
        }

        scanner.close();
    }

}