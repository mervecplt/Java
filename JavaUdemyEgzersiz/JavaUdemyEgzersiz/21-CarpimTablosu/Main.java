import java.util.Scanner;

public class Main {
    /*
     * Kullanıcıdan bir değer alıp 10 a kadar olan çarpımlarını ekrana
     * bastırın(Çarpım Tablosu Oluşturun)
     */
    public static void main(String[] args) {
        int sayi, i;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = scanner.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(sayi + " * " + i + " = " + (sayi * i));
        }

        scanner.close();
    }

}