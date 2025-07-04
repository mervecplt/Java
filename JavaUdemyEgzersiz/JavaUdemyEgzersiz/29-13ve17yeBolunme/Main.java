import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan pozitif bir tamsayıyı girdi olarak alıp
     * bu sayının 13 ve veya 17'ye bölünüp bölünmediğini bularak
     * bu durumu mesaj ile belirten programı yazınız
     */

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        n = scanner.nextInt();

        if ((n % 13 == 0) && (n % 17 == 0)) {
            System.out.println(n + " sayimiz hem 13'e hem de 17'ye tam bolunuyor");
        } else if ((n % 13 == 0)) {
            System.out.println(n + " sayimiz 13'e  tam bolunuyor");
        } else if ((n % 17 == 0)) {
            System.out.println(n + " sayimiz 17'ye  tam bolunuyor");
        } else {
            System.out.println(n + " sayimiz ne 13'e ne de 17'ye tam bolunuyor");
        }

        scanner.close();
    }

}