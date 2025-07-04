import java.util.Scanner;

public class Main {

    /*
     * Klavyeden girilen bir cümlenin tersten okunuşunun elde edilmesini sağlayan
     * programı recursive fonksiyon yardımıyla yazınız
     */

    public static void tersCumle(String metin, int index) {

        if (index == 0) {
            System.out.print(metin.charAt(index));
        } else {
            System.out.print(metin.charAt(index));
            tersCumle(metin, index - 1);
        }

    }

    public static void main(String[] args) {
        String cumle;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz:");
        cumle = scanner.nextLine();

        System.out.println("Cumlenin tersi:");
        tersCumle(cumle, cumle.length() - 1);

        scanner.close();
    }

}