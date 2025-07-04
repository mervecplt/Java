import java.util.Scanner;

public class Main {
    /*
     * Klavyeden girilen bir cümlenin kaç karakterden oluştuğunu (boşluk karakteri
     * dahil)
     * bulan programı recursive fonksiyon yardımıyla yazınız.
     */
    public static int karakter(String cumle, int index) {
        if (index == cumle.length()) {
            return 0;
        } else {
            return 1 + karakter(cumle, index + 1);
        }

    }

    public static void main(String[] args) {
        String cumle;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz:");
        cumle = scanner.nextLine();
        System.out.println("Karakter sayisi: " + karakter(cumle, 0));

        scanner.close();
    }

}