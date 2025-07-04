import java.util.Scanner;

public class Main {
    /*
     * Kullanıcı tarafından girilen 2 tam sayının
     * çarpımının positif işaretli mi negatif işaretli mi veya 0 mı olduğunu
     * sayıların çarpmadan bulan programı yazınız.
     */
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 adet sayi giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.print("Carpim positiftir");
        } else if ((a > 0 && b < 0) || (a < 0 && b > 0)) {
            System.out.print("Carpim negatiftir");
        } else {
            System.out.print("Carpim 0'dir");
        }

        scanner.close();
    }

}